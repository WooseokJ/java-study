package start.start_8_Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] sc2 = new int[]{11,22,33,44,55}; // 배열생성과 초기화.
        int[] sc3 = {11,22,33,44,55}; // 위와 동일. (좀더 편리)
        // 주의
        // sc3처럼 쓸떄 아래와같이 라인을 나누면 안된다.
//        int[] sc4;
//        sc4 = {11,22,33,44,55};

        int[] student = new int[5]; //  0  으로 자동 초기화 .
        student[0] = 10;
        System.out.println(student); // [I@a09ee92 주소값 출력
        System.out.println(student[0]); // 10 , .get은 arrayList에서 쓰임.
        System.out.println(student[1]); // 0

        /* int[] student = new int[5];
           는 4 byte * 5 = 20 bute를 메모리 확보한다 .
          자바는 메모리 어딘가에 배열에 접근할수있는 참조값(주소값)을 반환한다. ( student는 주소값을 갖고있다.)
          int[] student = [I@a09ee92  // new int[5]는 주소값으로 반환.
         * */

        // 자바의 변수의 데이터 타입은 크게 기본형과 참조형 로 분류
        // 기본형: int, long 같은 변수에 사용할 값을 직접넣을수있는 데이터타입 ( 사이즈 정해져있어 정적타입) 더 빠르고 효율적 메모리 사용.
        // 참조형: 배열같이 데이터에 접근하기 위한 참조값(주소값)을 저장하는 데이터타입. 객체나 클래스 모두 참조형. 정리: 배열, 클래스(사이즈 정해져있지않아 동적타입), 느리지만 더 복잡한 데이터구조 관리용이. (하지만 사실 별차이없다)
        // String은 사실 클래스다. 따라서 참조형이다!!!!. 그런데 기본형처럼 문자값을 바로 대입할수있다. 자바에서 편의기능을 제공한다.

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] st = new int[size]; // 이처럼 입력값에따라 배열크기 정해짐. 이를 동적 메모리 할당.

        // 2차원 배열
        int[][]arr = new int[2][3];
        int[][]arr2 = new int[][]{
            {1,1,1},
            {1,1,1}
        };
        int[][]arr3 = {
                {1,1,1},
                {1,1,1}
        };

        arr[0][0] = 1;
        for(int r = 0 ; r < arr.length; r++) { // arr.len = 2
            for(int c = 0 ; c < arr[r].length ; c++) { // arr[r].len = 3
                arr[r][c] = 1;
            }
        }


        // for Each: 배열에 주로 사용. 각 요소를 탐색 (제일많이 씀 실무에서)
        // 배열의 인덱스 사용안하고 종료조건안주어도 된다. 단순히 배열을 첨부터 끝까지 탐색.
        int[] arrone = {1,2,3,4,5};
        // iter 치면 forEach문 자동으로 만들어줘.

        for(int num: arrone) {
            // num은 각각 1,2,3,4,5
            if (num == 3) {
                break; // for문 바로 나옴.
            }
            System.out.println(num);
        }

        // for each문을 사용못하는경우, 증가할떄 index값 필요할떄
        for(int i = 0 ; i< arrone.length; i++) {
            // 이떄 i라는 인덱스값이 필요한경우.
        }



    }
}
