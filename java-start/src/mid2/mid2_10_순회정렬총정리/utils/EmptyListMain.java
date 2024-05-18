package mid2.mid2_10_순회정렬총정리.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변리스트 생성
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();

        // 빈 불변 리스트 생성.
        List<Integer> ls3 = Collections.emptyList(); // java 5 부터
        List<Integer> ls4 = List.of();// 자바 9부터
        System.out.println(ls3); // []
        System.out.println(ls4); // []
        System.out.println(ls3.getClass()); // Collections$EmptyList
        System.out.println(ls4.getClass()); // ImmutableCollections$ListN


        Integer[] arr = {1,2,3,4};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(0,100); // 0번쨰 인덱스 100 으로 수정.
        System.out.println(Arrays.toString(arr));
        System.out.println(arrList);
    }
}
