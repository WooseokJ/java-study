package mid1.mid_7_8_중첩내부클래스.내부클래스;

public class Car {
    private String model;
    private Engine engine;
    private int chargeLevel;

    public Car(String model, int chargeLevel) {
        this.model = model;
//        this.engine = new Engine(this);
        this.engine = new Engine();
        this.chargeLevel = chargeLevel;
    }
    // Engine에서만 쓰는 메서드
//    public String getModel() {
//        return model;
//    }
    // Engine에서만 쓰는 메서드
//    public int getChargeLevel() {
//        return chargeLevel;
//    }

    public void start() {
        engine.start();
        System.out.println(model + "시작완료");
    }



    // car에서만 사용.
    private class Engine {
//        private Car car; // 내부클래스는 바깥클래스의 소속이라서

        public void start() {
            // 리팩토리 전
//            System.out.println("충전LEVEL: "+car.getChargeLevel());
//            System.out.println(car.getModel() + "의 엔진 시작");

            // 리팩토리후
            System.out.println("충전LEVEL: " + chargeLevel);
            System.out.println(model + "의 엔진 시작");
        }

    }
}
