package mid2.mid2_10_순회정렬총정리.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> ls = List.of(1, 2, 3);
//        ls.add(10);  // 추가 불가능.
        // 불변 -> 가변 리스트
        ArrayList<Integer> mutableLs = new ArrayList<>(ls);
        mutableLs.add(3); // 추가가능.

        // 다시 가변 -> 불변
        List<Integer> unmodifiableLs = Collections.unmodifiableList(mutableLs);
//        unmodifiableLs.add(4); // 추가 불가능
    }
}
