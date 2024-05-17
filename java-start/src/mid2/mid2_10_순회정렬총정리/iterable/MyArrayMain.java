package mid2.mid2_10_순회정렬총정리.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        MyArray arr = new MyArray(nums);
        Iterator<Integer> iterator = arr.iterator();

        // iterator 사용 (이것을통해 모든자료구조는 hasNext, next 메서드로 동일한메서드로 순회할수있다.)
        while (iterator.hasNext()) { // 다음요소있어?
            Integer next = iterator.next();
            System.out.println(next);
        }



        // 항상된 for문
        // for-each사용
        for(int val: arr) {
            System.out.println("val: " +val);
        }

    }
}
