package mid2.mid2_3_ArrayList.배열;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr)); //[1, 2, 0, 0, 0]

        // 맨앞에 추가 - O(n)
        addFirst(arr, 3);
        System.out.println(Arrays.toString(arr)); //[3, 1, 2, 0, 0]


        // 중간에 추가 - O(n)
        addAtIndex(arr, 2, 4);
        System.out.println(Arrays.toString(arr)); // [3, 1, 4, 2, 0]

        // 맨뒤에 추기 - O(1)
        addlast(arr, 5);
        System.out.println(Arrays.toString(arr)); // [3, 1, 4, 2, 5]
    }

    public static void addFirst(int[] arr, int val) {
        // 뒤에서부터 기존index + 1 (오른쪽으로 미는 연산)
        for(int i = arr.length - 1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = val;
    }

    public static void addAtIndex(int [] arr, int index, int val) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = val;
    }
    public static void addlast(int[] arr, int val) {
        arr[arr.length-1] = val;
    }
}
