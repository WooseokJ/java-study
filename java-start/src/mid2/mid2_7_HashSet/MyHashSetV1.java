package mid2.mid2_7_HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;

    public MyHashSetV1() {
        buckets = new LinkedList[capacity];
        for(int i =0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public MyHashSetV1(int capacity) {
        this();
        this.capacity = capacity;
    }
    public boolean add(int val) {
        int hashIndex = hashIndex(val);
        LinkedList<Integer> innerArr = buckets[hashIndex];
        if(innerArr.contains(val)) {
            return false;
        }
        innerArr.add(val);
        size++;
        return true;
    }

    public boolean contains(int target) {
        int hashIndex = hashIndex(target);
        LinkedList<Integer> innerArr = buckets[hashIndex];
        return innerArr.contains(target);

    }
    private int hashIndex(int val) {
        return val % capacity;
    }

    public boolean remove(int val) {
        int hashIndex = hashIndex(val);
        LinkedList<Integer> innerArr = buckets[hashIndex];
        boolean result = innerArr.remove(Integer.valueOf(val)); // remove는 2가지가있다. index로 지우기, val로 지우기.
        // 그냥 숫자 적으면 index로 지워준다. innerArr.remove(val)
        // 그래서 Object타입으로 넣어줘야해. innerArr.remove(Integer.valueOf(val));
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
