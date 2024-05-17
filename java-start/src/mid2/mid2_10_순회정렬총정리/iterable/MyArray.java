package mid2.mid2_10_순회정렬총정리.iterable;

import java.util.Iterator;

// 자료구조 MyArrayList, MyLinkedList 등 같은거라고 생각하면된다.
public class MyArray implements Iterable<Integer>{ // MyArray는 순회할수있는이된다.


    private int[] nums;

    public MyArray(int[] nums) {
        this.nums = nums;
    }

    @Override
    public Iterator<Integer> iterator() { // 이 메서드 통해 순회한다.
        return new MyArrayIterator(nums);
    }



}
