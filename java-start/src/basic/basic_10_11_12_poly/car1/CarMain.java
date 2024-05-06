package basic.basic_10_11_12_poly.car1;

public class CarMain { // 이게 car0 패키지보다 더 올바른 방법,.
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량선택
        K3car k3car = new K3car();

        driver.setCar(k3car);
        driver.drive();

        // 차량선택
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();


        // OCP 운칙: 개방폐쇄원칙
        // 기존코드는 확장할수있고 기존코드의 수정은 되지않아야한다.
        // 새로운 차량 추가 -> 인터페이스통해 부모 클래스 변경안해도됨.(수정안해도됨.)
        // 새로운차량 추가시 기능추가 및 변경인데 이러한 변경에 확장에열려잇다

        // 전략패턴: 클라이언트 코드(Driver)의 변경없이 쉽게 교체가능.(위같은게 전략패턴이라함)
        // Car interface가 전략을 정의, 각 차량이 전략의 구체적인 구현이 된다.
    }
}
