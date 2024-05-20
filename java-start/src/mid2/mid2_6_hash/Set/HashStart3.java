package mid2.mid2_6_hash.Set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];
        arr[1] = 1;
        arr[2] = 2;
        arr[5] = 5;
        arr[8] = 8;
        arr[14] = 14;
        arr[99] = 99;

        System.out.println(Arrays.toString(arr));
        // [null,1,2 ........ 99 ]
        int target = 99;
        Integer result = arr[target]; // O(1)
        System.out.println(result); // 99

    }
}
