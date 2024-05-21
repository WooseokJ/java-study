package mid1.mid_7_8_중첩내부클래스.익명클래스.ex3;

import mid1.mid_7_8_중첩내부클래스.익명클래스.ex2.Process;

import java.util.Random;

public class ex3MainV3 {

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


    public static void main(String[] args) {
            // 지역클래스
//        class Dice implements Process {
//            @Override
//            public void run() {
//                //  코드 조각 시작
//                int randomVal = new Random().nextInt(6) + 1;
//                System.out.println(randomVal);
//                // 코드 조각 종료
//            }
//        }
//
//        class Sum implements Process {
//            @Override
//            public void run() {
//                // 코드 조각시작
//                for(int i =0; i <3; i++) {
//                    System.out.println(i);
//                }
//                // 코드 조각 종료
//            }
//        }

        // 익명클래스 사용
        Process dice = new Process() {
            @Override
            public void run() {
                //  코드 조각 시작
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println(randomVal);
                // 코드 조각 종료
            }
        };
        Process sum = new Process() {
            @Override
            public void run() {
                // 코드 조각시작
                for(int i =0; i <3; i++) {
                    System.out.println(i);
                }
                // 코드 조각 종료
            }
        };


        hiDice(dice);
        hiSum(sum);

    }
}
