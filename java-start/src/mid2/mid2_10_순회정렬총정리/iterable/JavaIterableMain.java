package mid2.mid2_10_순회정렬총정리.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        printAll(ls.iterator()); // Iterator<Integer>타입
        forEach(ls); // Iterable은 최상위라서 List타입 받을수있다. //Parent a = new Child와 동일..

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator()); // Iterator<Integer>타입
        forEach(set); //

    }

    public static void printAll(Iterator<Integer> iterator) {
        System.out.println(iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    // forEach문
    public static void forEach(Iterable<Integer> iterable) {
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

}
