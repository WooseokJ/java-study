package mid2.mid2_6_hash.Set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        arr[1] = 1;
        arr[2] = 2;
        arr[5] = 5;
        arr[8] = 8;

        System.out.println(Arrays.toString(arr));
        // [null, 1, 2, null, null, 5, null, null, 8, null]

        int target = 8;
        Integer result = arr[target]; // O(1)
        System.out.println(result); // 8


    }
}
