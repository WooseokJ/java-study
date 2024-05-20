package mid2.mid2_6_hash.Set;

import java.util.ArrayList;
import java.util.Arrays;

public class HashStart5 {
    public static final int CAPACITY = 10;
    public static void main(String[] args) {
        // 이중배열 리스트 ArrayList바구니 각각 안에 또 배열을 만듬.
        ArrayList<Integer>[] buckets = new ArrayList[CAPACITY];
        System.out.println(Arrays.toString(buckets));
        // [null, null, null, null, null, null, null, null, null, null]

        // 가각 배열 만들어줌
        for(int i = 0; i < CAPACITY; i++) {
            buckets[i] = new ArrayList<>();
        }
        System.out.println(Arrays.toString(buckets));
        // [[], [], [], [], [], [], [], [], [], []]

        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println(Arrays.toString(buckets));
        // [[], [], [], [], [], [], [], [], [], [99, 9]]

        // 검색
        int target = 9;
        boolean contains = contains(buckets, target);
        System.out.println(target + " : " + contains);
        // 9 : true


    }
    private static boolean contains(ArrayList<Integer>[] buckets, int target) {
        int hashIndex = hashIndex(target);
        ArrayList<Integer> innerArr = buckets[hashIndex]; // O(1)
        return innerArr.contains(target); // O(n)
    }
    public static void add(ArrayList<Integer>[] buckets, int val) {
        int hashIndex = hashIndex(val);
        ArrayList<Integer> innerArr = buckets[hashIndex];
        // 내부에 배열안에 찾는 원소값 없으면 추가.
        if(!innerArr.contains(val)) {
            innerArr.add(val);
        }
    }
    public static int hashIndex(int val) {
        return val % CAPACITY;
    }


}
