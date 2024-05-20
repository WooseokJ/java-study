package mid2.mid2_8_Set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        // HashSet
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        // class java.util.HashSet
        // [A, 1, B, 2, C] //  순서보장 x

        run(linkedHashSet);
        // class java.util.LinkedHashSet
        // [C, B, A, 1, 2] // 입력 순서 보장

        run(treeSet);
        // class java.util.TreeSet
        // [1, 2, A, B, C] // 데이터순서대로 정렬됨.



    }
    private static void run(Set<String> set) {
        System.out.println(set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println(set);

        // 하나하나 순회
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
    }
}
