package mid2.mid2_3_ArrayList.배열;

import java.util.Arrays;

public class ArrayMain1 {


    public static void main(String[] args) {
        //배열같이 여러데이터를 구조화해 다루는것을 자료구조라함.
        // java는 collection프레임워크라는 이름으로 여러 자료주고를 제공.

        // 우리가아는 배열
        int[] arr = new int[5];

        // index 입력: O(1)
        System.out.println("== index 입력 O(1) == ");
        arr[0] = 1; // O(1)
        arr[1] = 2;
        System.out.println(Arrays.toString(arr)); //배열값 출력.


        // index 변경: O(1)
        System.out.println("== index 변경 O(1) == ");
        arr[1] = 10;//  빠르게 찾는다. 어떻게 빠르게 찾지?
        System.out.println(Arrays.toString(arr));


        // index 조회: O(1)
        System.out.println("== index 조회 O(1) == ");
        System.out.println("arr[1] = " + arr[1]); //바로 꺼낸다 . 어떻게 바로꺼내지?


        // 배열 검색: O(n)
        System.out.println("== 배열 검색 O(n) == ");
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
            if(arr[i] == target) {
                System.out.println("찾음");

            }        }
    }

}
