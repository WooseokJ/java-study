package mid1.mid_7_8_중첩내부클래스.내부클래스;

import mid1.mid_7_8_중첩내부클래스.내부클래스.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("model u", 100);
        car.start();
//        충전LEVEL: 100
//        model u의 엔진 시작
//        model u시작완료


        Car car1 = new Car("model u", 100);
        car1.start();

//        충전LEVEL: 100
//        model u의 엔진 시작
//        model u시작완료

    }
}
