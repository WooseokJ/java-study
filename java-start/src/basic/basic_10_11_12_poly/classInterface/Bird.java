package basic.basic_10_11_12_poly.classInterface;

public class Bird extends AbstractAnimal implements Fly{ // 상속은 한개만, interface 구현은 여러개, extends먼저 나오는 순서중요.
    @Override
    public void sound() {
        System.out.println("새 소리");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
