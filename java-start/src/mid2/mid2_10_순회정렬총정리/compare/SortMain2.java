package mid2.mid2_10_순회정렬총정리.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] arr = {3,2,1};
        // 오름차순
        // sort(대상 T, Comparator타입)
        Arrays.sort(arr, new AscComparator()); // compare의 o1,o2 파라미터로 2,3 부터  들어감.
        System.out.println(Arrays.toString(arr)); // 1,2,3

        // 내림차순

        Arrays.sort(arr, new DescComparator());
        System.out.println(Arrays.toString(arr)); // 3 2 1
        Arrays.sort(arr, new AscComparator().reversed()); // 3,2,1 // DescComparator와 동일.
        System.out.println(Arrays.toString(arr)); // 3 2 1


    }
    // 오름차순 정렬 만들기
    public static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+ o1 + " o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    // 내림차순 정렬 만들기
    public static class DescComparator implements Comparator<Integer> {

        // -1 * -1 = 1
        // 1 * -1 = -1
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = "+ o1 + " o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1 ; // 최종결과에 -1 곱함.
        }
    }
}
