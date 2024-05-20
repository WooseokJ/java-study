package mid2.mid2_7_HashSet;

import java.util.Objects;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);
        //MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B, SET], [C], [D], [], [], [], [], [], [], []], size=6, capacity=10}
        System.out.println("A".hashCode());// 65
        System.out.println("AB".hashCode());// 2081

        // 검색
        String target = "SET";
        boolean result = set.contains(target);
        System.out.println(result); // true
    }
}
