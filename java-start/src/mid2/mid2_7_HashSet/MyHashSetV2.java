package mid2.mid2_7_HashSet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {

    static final int DEFAULT_CAPACITY = 16;

    LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;

    public MyHashSetV2() {
        buckets = new LinkedList[capacity];
        for(int i =0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    public MyHashSetV2(int capacity) {
        this();
        this.capacity = capacity;
    }
    public boolean add(Object val) {
        int hashIndex = hashIndex(val);
        LinkedList<Object> innerArr = buckets[hashIndex];
        if(innerArr.contains(val)) {
            return false;
        }
        innerArr.add(val);
        size++;
        return true;
    }

    public boolean contains(Object target) {
        int hashIndex = hashIndex(target);
        LinkedList<Object> innerArr = buckets[hashIndex];
//        for (Object o : innerArr) {
//            if(o.equals(target)) return true;
//        }
//        return false;
        return innerArr.contains(target); //위와 동일.

    }
    private int hashIndex(Object val) {
        return Math.abs(val.hashCode()) % capacity; // val.hashCode가 음수될수있어서(index로써야하니) 절대값 씌움.
    }

    public boolean remove(Object val) {
        int hashIndex = hashIndex(val);
        LinkedList<Object> innerArr = buckets[hashIndex];
        boolean result = innerArr.remove(val); // remove는 2가지가있다. index로 지우기, val로 지우기.
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
