package mid2.mid2_6_hash.Set;

import java.util.Arrays;

public class HashStart4 {
    public static final int CAPACITY = 10;

    public static void main(String[] args) {
        Integer[] arr = new Integer[CAPACITY];
        // 해시인덱스의 데이터 추가
        add(arr, 1);
        add(arr, 2);
        add(arr, 5);
        add(arr, 8);
        add(arr, 14);
        add(arr, 99);
        System.out.println(Arrays.toString(arr));
        // [null, 1, 2, null, 14, 5, null, null, 8, 99]

        // 해시인덱스의 데이터 조회
        int target = 99;
        int hashIndex = hashIndex(target);
        Integer val = arr[hashIndex]; // O(1)
        System.out.println(val); // 99
    }

    public static void add(Integer[] arr, int val) {
        int hashIndex = hashIndex(val);
        arr[hashIndex] = val;
    }
    public static int hashIndex(int val) {
        return val % CAPACITY;
    }


}
