package mid2.mid2_10_순회정렬총정리.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        // List<Integer>나 ArrayList나 큰차이는 없다 사실상.
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(100);
        ls.add(3);
        ls.add(4);

        Integer max = Collections.max(ls); // 가장큰값.  100
        Integer min = Collections.min(ls); // 가장작은값  1
        Collections.shuffle(ls); // 랜덤하게 섞음.
        System.out.println("shuffle: "+ls); // 결과 매번달라져.
        Collections.sort(ls);
        System.out.println(ls); // [1,2,4,5,100]
        Collections.reverse(ls);
        System.out.println(ls); // [100, 5, 4, 2, 1]

    }
}
