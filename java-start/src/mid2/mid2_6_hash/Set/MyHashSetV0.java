package mid2.mid2_6_hash.Set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10]; // 10개정도 공간 두자
    private int size = 0;

    // O(n) - contains떄문
    public boolean add(int val) {
        if(contains(val)) {
            return false;
        }
        elementData[size] = val;
        size++;
        return true;
    }
    //O(n)
    public boolean contains(int val) {
        for(int data: elementData) {
            if(data == val) {
                return true;
            }
        }
        return false;
    }
    public int getSize() {return size;}

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}
