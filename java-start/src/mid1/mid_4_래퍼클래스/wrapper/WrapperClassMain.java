package mid1.mid_4_래퍼클래스.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer i = new Integer(10); // 권장 x (아주오랜뒤에 삭제예정)
        Integer i1 = Integer.valueOf(10); // 얘를 권장.(불면)
        Integer i2 = Integer.valueOf(10);
        Long l = Long.valueOf(10); // Double, 다 가능.
        System.out.println("i = " + i); // 10
        System.out.println("i1 = " + i1);  // 10

        // 내부값읽기
        int intValue = i1.intValue();
        System.out.println("intValue = " + intValue); // 내부값 꺼냄. 10
        long l1 = l.longValue();

        // 비교
        System.out.println(i == i1); // false
        System.out.println(i.equals(i1)); // true
        System.out.println(i1 == i2); // true

    }
}
