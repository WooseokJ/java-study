package mid2.mid2_7_HashSet;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");// 대문자주의
        Member java = new Member("java");
        Member spring = new Member("spring");
        System.out.println(hi.hashCode()); // 3360
        System.out.println(jpa.hashCode()); // 73690
        System.out.println(java.hashCode()); // 3254849
        System.out.println(spring.hashCode()); // -895679956

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);
        // MyHashSetV2{buckets=[[Member{id='hi'}, Member{id='JPA'}], [], [], [], [], [], [Member{id='spring'}], [], [], [Member{id='java'}], [], [], [], [], [], []], size=4, capacity=10}

        // 검색
        Member target = new Member("JPA");
        boolean result = set.contains(target);
        System.out.println(result); // true;
    }
}
