package start.start_3_4_5_Operator;

public class Comp {
    public static void main(String[] args) {
        String str1 = "start";
        String str2 = "basic";
        str1.equals(str2); // 두개 같은지 비교
        int a = 14;
        int b = 15;
        boolean result = 10 < a && a < 20; // 이처럼 쓰는게 좋아.(가독성)


        // 조건문
        int grade = 1;
        int coupon = 0;
        switch (grade) {
            case 1: coupon = 100;
            case 2: coupon = 200;
        }
        System.out.println(coupon); // 200 출력.

        switch (grade) {
            case 1: coupon = 100; break;
            case 2: coupon = 200;
            default:
        }
        System.out.println(coupon); // 100 출력.
        // 즉 switch문 쓸떄는 break을 선언해줘야 원하는값 얻음.(이를 해결하기위해 아래가나옴)


        // 자바 14에서 새로운 switch문
        coupon = switch(grade) {
            case 1 -> 33;
            case 2 -> 55;
            default -> 44;
        };
        System.out.println(coupon); // 33 출력.

        String stutus = (coupon > 200) ? "start" : "basic"; // 삼항연산자.

        // do whilte문: 조건상관없이 무조건 한번은 코드 실행 (최초 한번만 실행할경우 사용)
        int sum = 10;
        int s;
        do {
            s = 111; // 무조건 do 문 실행.
        } while (sum < 0);

        System.out.println(s);

        // break : 즉시 while문 빠져나옴
        // continue: 즉시 조건식으로 이동.
        // while(trye)는 for(;;) 와 동일, 조건식이없으므로.
    }
}
