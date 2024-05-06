package basic.basic_10_11_12_poly.interfaceEx;

public class Dog implements InterfaceAnimal{ //implements 는 구현.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개이동.");
    }
}
