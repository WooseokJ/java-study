package basic.basic_9_extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 전기차 빠르게 이동
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // 자바는 다중상속 지원하지않아. 하나의 클래스만 상속가능한 단일상속.
        // 다이아몬드 문제: 여려클래스를 상속받으면 거기서 move() 메서드가 공통으로있다할떄 어떤 move를 상속받아야하는지 모르는상황.(그래서 단일상속만 가능.), 그리고 클래스계층구조가 복잡해진다.
        // 대신 interface는 다중구현을 허용.


        //상속과 메모리 구조
        // ElectricCar 객체 생성시 부모의 Car 객체도 만들어진다. 참조값은 하나지만 객체가 둘다 생겨.
        // 내부에서는 부모,자식모두 생성되고 공간도 구분된다.
        // electricCar.charge() 호출시 x001 참조값으로 가고 부모의 Car에서 charge를 찾는지 electricCar에서 charge를 찾는지 선택해야한다.
        // 호출하는 변수의 타입을 기준으로 charge를 찾는다. ElectricCar electricCar 로 ElectricCar 타입에서 찾는다.
        // electricCar.move();는 먼저 ElectricCar에서 찾고 없으면 부모클래스에서 찾는다.


        // 오버로딩: 메서드 이름같고 파라미터가 다른 메서드를 여러개 정의하는것. , 번역시 과적하게 물건을 담았다는 의미. 하나의 메서드에 여러개 정의했다의미.
        // 오버라이딩: 하위클래스에서 상위클래스의 메서드를 재정의하는것., 직역하면 무언가를 다시 정의한다.
         // static, final, private이 붙은 메서드는 오버라이딩 못한다.
        // final은 재정의를 금지
        // static은 클래스 영역에서 동작하므로 인스턴스 영역에서 사용하는 오버라이딩이 의미없다.(그냥 클래스명으로 접근하면된다.)
        // private은 해당 클래스에서만 접근되므로.
        // 생성자는 오버라이딩 불가능.



    }
}
