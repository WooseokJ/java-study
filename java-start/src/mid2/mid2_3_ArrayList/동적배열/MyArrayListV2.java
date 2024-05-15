package mid2.mid2_3_ArrayList.동적배열;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5; // 기본 용량

    private Object[] elementData; // 들어오는 데이터 (여기도 배열)
    private int size = 0; // 데이터 크기

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initalCapacity) {
        elementData = new Object[initalCapacity];
    }

    public int size() {
        return size;
    }
    public void add(Object e) { // 값추가.
        // 코드를 추가한 부분
        if(size == elementData.length) { // 값이 들어오는데 이미 size = 5, capacity = 5 랑 같은상황.
            grow(); // 배열을 키움.
        }

        elementData[size] = e;
        size++;
    }
    private void grow() {
        // 배열 큰배열 만들고
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2; // 더 큰배열은 2배로 설정.

        // 방법1. 더큰 배열 생성해서 기존배열 값 넣기.
//        Object[] newArr = new Object[newCapacity];
//        for(int i =0; i< elementData.length; i++)
//            newArr[i] = elementData[i];

        // 방법2. 방법1과 동일.
        Object[] newArr2 = Arrays.copyOf(elementData, newCapacity);

        // 기본배열을 더큰배열로 바꾸기.
        elementData = newArr2;
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

