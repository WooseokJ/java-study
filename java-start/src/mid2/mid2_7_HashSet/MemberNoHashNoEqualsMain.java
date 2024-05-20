package mid2.mid2_7_HashSet;

public class MemberNoHashNoEqualsMain {
    public static void main(String[] args) {
        // hashCode()구현x, equals() 구현 x
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEquals m1 = new MemberNoHashNoEquals("A");
        MemberNoHashNoEquals m2 = new MemberNoHashNoEquals("A");
        System.out.println(m1.hashCode()); // 258952499
        System.out.println(m2.hashCode()); // 603742814
        System.out.println(m1.equals(m2)); // false


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        //MyHashSetV2{buckets=[[], [], [], [], [MemberNoHashNoEquals{id='A'}], [], [], [], [], [MemberNoHashNoEquals{id='A'}], [], [], [], [], [], []], size=2, capacity=10}

        //  중복등록시 검색실패
        MemberNoHashNoEquals target = new MemberNoHashNoEquals("A");
        System.out.println(target.hashCode()); // 455659002
        boolean result = set.contains(target);
        System.out.println(result); // false

    }
}
