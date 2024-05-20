package mid2.mid2_7_HashSet;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // 중복 hashIndex
        System.out.println(set);
        // MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [9], [], [], [], [], [14], []], size=7, capacity=16}

        // 검색
        int target = 9;
        boolean result = set.contains(target);
        System.out.println(target + " = " + result); // 9  = true

        // 삭제
        boolean removeResult = set.remove(target);
        System.out.println(removeResult);// true
        System.out.println(set);
        //MyHashSetV1{buckets=[[], [1], [2], [99], [], [5], [], [], [8], [], [], [], [], [], [14], []], size=6, capacity=16}
    }
}
