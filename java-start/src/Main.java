

public class Main {
    public static void main(String[] args) { // psvm 치면 만들어져
        System.out.println(10); //sout 치면 만들어져
        System.out.println(); // command + shift + enter하면 세미콜론 붙여줌.


        // 참고로 command + option + L 은 코드 자동정렬.

        System.out.println(1); // 얘만 띄어져.
        System.out.printf("1"); // 띄어쓰기 안됨. // %d, 같은 서식문자 사용시 사용.,
        System.out.print(3); // 띄어쓰기 안됨.
        /** 출력결과
         1
         23

         System.out.printf(1); 오류난다.
         이유: pringf 메서드가 최소 하나이상문자열 매개변수 요구하므로 %d같은 서식문자 사용해야해.
         System.out.printf("%d",1);
         * */

        // 메인메서드는 정적메서드라서 클래스안에서 우리가 메서드를 만들떄 static을 붙여준거.(정적메서드는 정적메서드만 호출이가능)
//        test(); // error
        testStatic(); //가능
    }

    void test() {
    }

    static void testStatic() {
    }
}