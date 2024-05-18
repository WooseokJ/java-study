package mid2.mid2_10_순회정렬총정리.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();

        // 쓰레드1
        ls.add(1);
        ls.add(2);
        ls.add(3);

        // 쓰레드2
        ls.remove(1);


        System.out.println(ls.getClass());
        // 일반리스트를 멀티쓰레드 상황에 동기화문제 발생하지않는 안전한 리스트로 반들어줌.
        // 근데 동기화작업으로인해 일반리스트보다 성능은 더 느려.
        List<Integer> synchronizedList = Collections.synchronizedList(ls);
        System.out.println(synchronizedList.getClass());

    }
}
