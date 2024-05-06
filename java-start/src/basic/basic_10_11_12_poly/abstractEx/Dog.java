package basic.basic_10_11_12_poly.abstractEx;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("개 울음");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
