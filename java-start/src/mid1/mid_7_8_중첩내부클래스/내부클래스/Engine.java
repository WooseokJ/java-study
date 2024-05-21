package mid1.mid_7_8_중첩내부클래스.내부클래스;


// Car에서만 사용.
public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
//        System.out.println("충전LEVEL: "+car.getChargeLevel());
//        System.out.println(car.getModel() + "의 엔진 시작");
    }

}
