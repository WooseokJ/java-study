package mid2.mid2_7_HashSet;

public class MemberOnlyHashCodeMain {
    public static void main(String[] args) {
        // hashCode()구현, equals() 구현 x
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHashCode m1 = new MemberOnlyHashCode("A");
        MemberOnlyHashCode m2 = new MemberOnlyHashCode("A");
        System.out.println(m1.hashCode()); // 96
        System.out.println(m2.hashCode()); // 96
        System.out.println(m1.equals(m2)); // false (아직 equals 구현안해서. 여기서 쓰는 equals는 Object 객체의 메서드이다. -> 즉, 인스턴스 참조값이 같은지 비교)

        System.out.println(System.identityHashCode(m1)); // 해당 인스턴스 객체 참조값 (258952499)
        System.out.println(System.identityHashCode(m2)); // 해당 인스턴스 객체 참조값 (603742814)


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        //MyHashSetV2{buckets=[[], [], [], [], [], [], [MemberOnlyHashCode{id='A'}, MemberOnlyHashCode{id='A'}], [], [], [], [], [], [], [], [], []], size=2, capacity=10}

        //  중복등록시 검색실패
        MemberOnlyHashCode target = new MemberOnlyHashCode("A");
        System.out.println(target.hashCode()); // 96
        boolean result = set.contains(target);
        System.out.println(result); // false

    }
}
