package mid1.mid_4_래퍼클래스.math;

import java.util.Random;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.max(10,30));// 30
        System.out.println(Math.min(10,30)); // 10
        System.out.println(Math.abs(-10)); // 10

        System.out.println(Math.ceil(2.1)); // 3.0
        System.out.println(Math.floor(2.1)); // 2.0
        System.out.println(Math.round(2.1)); // 2 // 반올림.

        System.out.println(Math.sqrt(4)); // 2
        System.out.println(Math.random()); // 0.0~1.0사이 double값 ex) 0.8578648611030871

        // 정말정실한 숫자,반올림계산필요시(돈계산같은) BigDecimal 사용.


        // Random
        Random random = new Random();
        int randomInt = random.nextInt(); // 랜덤int 반환.
        System.out.println(randomInt); //1614900051 (바뀔수있어)

        double randomDouble = random.nextDouble(); //0.0d ~ 1.0d
        System.out.println(randomDouble); // 0.14612590388164626 ( 바뀔수있어)

        int a = random.nextInt(10);// 0~9까지 임의의수
        int b = random.nextInt(10) + 1; // 1~10까지


        //Seed란개념
        Random random1 = new Random(1);// 안의 1이 seed가 1 , Seed가 같으면 Random의 결과가 항상같다.
        System.out.println(random1.nextInt()); // 항상 -1155869325
        System.out.println(random1.nextDouble()); // 항상 0.10047321632624884


    }
}
