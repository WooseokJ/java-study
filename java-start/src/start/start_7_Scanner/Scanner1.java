package start.start_7_Scanner;

import java.util.Scanner; // java 라이브러리 사용.

public class Scanner1 { // 사용자 입력 편하게 할수있다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // 입력을 String 으로 가져옴.  1입력시 "1"로 받음., \n을 입력할떄까지 문자가져옴.
        sc.nextInt(); // 입력을 int형 으로 가져옴. 다른타입(ex 아아아)  입력시 int형 아니므로 에러남.
        sc.nextDouble();
    }
}
