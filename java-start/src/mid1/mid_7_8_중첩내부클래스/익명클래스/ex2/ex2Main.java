package mid1.mid_7_8_중첩내부클래스.익명클래스.ex2;

import java.util.Random;

public class ex2Main {

    public static void hiDice() {
        System.out.println("플밍 시작");
        //  코드 조각 시작
        int randomVal = new Random().nextInt(6) + 1;
        System.out.println(randomVal);
        // 코드 조각 종료

        System.out.println("플밍 종료");
    }

    public static void hiSum() {
        System.out.println("플밍 시작");
        // 코드 조각시작
        for(int i =0; i <3; i++) {
            System.out.println(i);
        }
        // 코드 조각 종료

        System.out.println("플밍 종료");
    }
    public static void main(String[] args) {
        hiDice();
        hiSum();
    }
}
