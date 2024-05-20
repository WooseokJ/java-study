package mid2.mid2_7_HashSet;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object 의 기본 HashCode는 객체의 참조값 기반으로 생성.
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.hashCode()); // 168423058
        System.out.println(o2.hashCode()); // 821270929
        System.out.println(o1); // java.lang.Object@a09ee92 , a09ee92는 168423058의 16진수.
        System.out.println(Integer.toHexString(o1.hashCode())); //a09ee92

        // 각 클래스마다 hashCode를 이미 오버라이딩(재정의)해둿다.
        Integer i = 10;
        String strA = "A";
        String strAa = "Aa";
        System.out.println(i.hashCode()); // 10
        System.out.println(strA.hashCode()); // 65
        System.out.println(strAa.hashCode()); // 2112 (더하기만하는게아니라 사실은 충돌안되게 여러복잡한게 들어가있어)

        // hashCode는 마이너스값 들어올수있다.
        System.out.println(Integer.valueOf(-1).hashCode()); // -1

        //둘은 같을까? 인스턴스는 달라, equals는 같다.
        Member m1 = new Member("idA");
        Member m2 = new Member("idA");

        // equasl, hashCode를 오버리이딩(재정의) 한경우 비교.
        System.out.println((m1 == m2)); // false;
        System.out.println((m1.equals(m2))); // true
        System.out.println((m1.hashCode())); // 104101  id기준으로 해시코드 만들어짐.
        System.out.println((m2.hashCode())); // 104101

        // equasl, hashCode를 오버리이딩(재정의) 하지않은경우 비교. (Member클래스의 hashCode() 재정의안하고 Object의 hashCode()를 사용)
        System.out.println((m1 == m2)); // false;
        System.out.println((m1.equals(m2))); // true
        System.out.println((m1.hashCode())); // 1247233941
        System.out.println((m2.hashCode())); // 258952499
    }
}
