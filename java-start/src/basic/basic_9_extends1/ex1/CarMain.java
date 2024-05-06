package basic.basic_9_extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // move는 공통의 기능이다.
        // 상속은 기존클래스의 필드와메서드를 새로운클래스에서 재사용하게해줌.
        // extends는 하나만 선택가능.
        // 같은 패키지안에만 상속가능.
    }
}
