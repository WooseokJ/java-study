package mid2.mid2_10_순회정렬총정리.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> { // 배열 반복할수있는 반복자

    private int currentIndex = -1;
    private int[] targetArr; // 순회하고싶은 배열

    public MyArrayIterator(int[] targetArr) { // 주입
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < (targetArr.length - 1); // 현재 인덱스가 배열의 끝에있는지 여부
    }

    @Override
    public Integer next() {
        currentIndex++; // 0꺼내짐.
        return targetArr[currentIndex]; // 0번쨰 원소 반환.
    }
}
