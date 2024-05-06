package basic.basic_10_11_12_poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("model3 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("model3 끝");
    }
}
