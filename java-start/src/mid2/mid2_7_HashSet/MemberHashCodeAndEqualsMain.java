package mid2.mid2_7_HashSet;

public class MemberHashCodeAndEqualsMain {
    public static void main(String[] args) {
        // hashCode()구현, equals() 구현 - Member에 구현해두었다.
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println(m1.hashCode()); // 96
        System.out.println(m2.hashCode()); // 96
        System.out.println(m1.equals(m2)); // true

        // 중복데이터 없이 데이터 추가
        set.add(m1);
        set.add(m2);
        System.out.println(set);
        //MyHashSetV2{buckets=[[], [], [], [], [], [], [Member{id='A'}], [], [], [], [], [], [], [], [], []], size=1, capacity=10}

        // 데이터 검색 성공
        Member target = new Member("A");
        System.out.println(target.hashCode()); // 96
        boolean result = set.contains(target);
        System.out.println(result); // true

    }
}
