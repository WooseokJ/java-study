package mid2.mid2_3_ArrayList.리스트;

import java.util.Arrays;

// MyArrayListV4와 코드는 동일
public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 5; // 기본 용량

    private Object[] elementData; // 들어오는 데이터 (여기도 배열)
    private int size = 0; // 데이터 크기

    public MyArrayList() { // 생성자에 E 못씀
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initalCapacity) {
        elementData = new Object[initalCapacity];
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public void add(E e) { // 값추가.
        if(size == elementData.length) { // 값이 들어오는데 이미 size = 5, capacity = 5 랑 같은상황.
            // 배열 키움.
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity * 2; // 더 큰배열은 2배로 설정.
            elementData = Arrays.copyOf(elementData, newCapacity);
        }


        elementData[size] = e;
        size++;
    }
    @Override
    public void add(int index, E e) {
        if(size == elementData.length) { // 값이 들어오는데 이미 size = 5, capacity = 5 랑 같은상황.
            // 배열 키움.
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity * 2; // 더 큰배열은 2배로 설정.
            elementData = Arrays.copyOf(elementData, newCapacity);
        }

        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }
    public void shiftRightFrom(int index) {
        // 마지막부터 ~ index까지  오른쪽 밀기
        for(int i = size; i > index; i--)
            elementData[i] = elementData[i-1];
    }
    public void shiftLefttFrom(int index) {
        // index부터 마지막까지 왼쪽밀기
        for(int i = index; i < size - 1; i++)
            elementData[i] = elementData[i+1]; // 1 -> 0 , 2 -> 1, 3-> 2
    }
    @Override
    public E remove(int index) {
        E oldValue = get(index);
        // 데이터이동
        shiftLefttFrom(index);

        size--;
        elementData[size] = null; // 마지막위치에 null (마지막값이 남아있는거 제거하기위해)
        return oldValue; //빼는 부분 반환.
    }

    @SuppressWarnings("unchecked") // 경고 무시.(중요한건아님)
    @Override
    public E get(int index) { // 값 가져오기
        return (E) elementData[index];
    }
    @Override
    public E set(int index, Object e) { // 특정위치에 값 변경
        E oldValue = get(index);
        elementData[index] = e;
        return oldValue; //반환값은 교체하기 이전의 값 반환.
    }
    @Override
    public int indexOf(E o) { // 해당 값의 인덱스값 반환
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
