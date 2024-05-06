package start.start_6_Scope;

public class Scope { // 변수에 접근가능한 범위.
    public static void main(String[] args) {
        int i = 10; // 지역변수(local variable) , main메서드 안에서 선언한 변수는 실행종료까지 살아있다.
        if (true) {
            int x = 20; // if문 범위 벗어나면 변수 없어짐.
        }
//        System.out.println(x); // error
        System.out.println(i); // 10
        // 지역변수는 코드 블럭안에서만 살아있으므로 이름이 그런거.

        // cast는 금속이나 다른물질 녹여 특정형태로 만드는것에서 유래 .
        // 형변환(casting): 작은범위에서 큰범위 값 넣을수있다. (그릇생각하면됨)
        int a = 10;
        double b;
        b = a; // 큰거에 작은거 넣는거 (int < float)
//        a = 33.3; // error , 작은거에 큰거 넣는거.

        // 자동형변환(묵시적 형변환): 큰거에 작은거 넣는거할떄 자바가 자동으로 해줌.
        b = a;
        b = (double) a; // 형맞추기
        b = (double) 10; // 변수값읽기
        b = 10.0; // 형변환

        // a = 33.3; 을 명시적 형변형으로 변환.   (int) 33.3같은거를 명시적형변환.
        a = (int) 33.3; // 33   이는 숫자 손실이 날아갈수있다. (작은컵에 큰컵 넣을떄 손실나는거 생각)

        long max = 2147483647; // 2147483647은 int 최고값
        long min = 2147483648L; // 2147483648은 int 최고값 + 1 (초과)
        int intValue = 0;
        intValue = (int) max; //형변환
        System.out.println(intValue); // 2147483647
        intValue = (int) min; // 형변환
        System.out.println(intValue); // -2147483648
        // 오버플로우: 큰 범위형을 넘으면 작은 범위형으로 되는것.
// 절대 오버플로우 발생시 계산해서 해결하지마  -> 이를 해결하기위해 int를 long으로 그냥 선언. long intValue로

        intValue = (int) min; // 형맞추기
        intValue = (int) 2147483648L; // 변수값읽기
        intValue = -2147483648; //형변환


        // 같은 타입끼리 계산은 같은 타입결과 낸다.
        // 서로 다른 타입계산은 작은 타입이 큰범위로 자동형변환 일어난다. int + double -> double + double로 변환.
        int div1 = 3 / 2; // 1   같은타입
        double div2 = 3 / 2; // 1.0 // 같은타입
        double div3 = 3.0 / 2; // 1.5 / 다른타입
        double div4 = (double) 3 / 2; // 1.5 // 다른타입


    }
}
