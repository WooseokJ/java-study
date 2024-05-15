package mid2.mid2_3_ArrayList.동적배열;

import java.util.Arrays;

// 직접 동적배열(리스트) 만들기
// 참고: MyArrayList는 이미 자바에서 만들어둠.
public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5; // 기본 용량

    private Object[] elementData; // 들어오는 데이터 (여기도 배열)
    private int size = 0; // 데이터 크기

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initalCapacity) {
        elementData = new Object[initalCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) { // 값추가.
        elementData[size] = e;
        size++;
    }
    public Object get(int index) { // 값 가져오기
        return elementData[index];
    }
    public Object set(int index, Object e) { // 특정위치에 값 변경
        Object oldValue = get(index);
        elementData[index] = e;
        return oldValue; //반환값은 교체하기 이전의 값 반환.
    }

    public int indexOf(Object o) { // 해당 값의 인덱스값 반환
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i]))
                return i; // 찾으면 index번호 반환.
        }
        return -1; // 없으면 -1
    }

    public String toString() {
        // [1,2,3,null,null] // size = 3
        // [1,2,3] // size = 3
        Object[] objects = Arrays.copyOf(elementData, size);
        return Arrays.toString(objects) + " -> size=" + size + " capacity="+elementData.length;
    }



}
