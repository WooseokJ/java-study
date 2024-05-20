package mid2.mid2_7_HashSet;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<Object> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 검색
        String target = "A";
        boolean result = set.contains(target);
        System.out.println(result); // true



    }
}
