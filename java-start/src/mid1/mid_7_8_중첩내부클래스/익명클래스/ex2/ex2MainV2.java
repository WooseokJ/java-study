package mid1.mid_7_8_중첩내부클래스.익명클래스.ex2;

import java.util.Random;

public class ex2MainV2 {

    public static void hiDice(Process process) {
        System.out.println("플밍 시작");
        process.run();
        System.out.println("플밍 종료");
    }

    public static void hiSum(Process process) {
        System.out.println("플밍 시작");
        process.run();
        System.out.println("플밍 종료");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            //  코드 조각 시작
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println(randomVal);
            // 코드 조각 종료
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            // 코드 조각시작
            for(int i =0; i <3; i++) {
                System.out.println(i);
            }
            // 코드 조각 종료
        }
    }
    public static void main(String[] args) {
        hiDice(new Dice());
        hiSum(new Sum());
    }
}
