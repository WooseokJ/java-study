package basic.basic_10_11_12_poly.car1;

public class K3car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 끝");
    }
}
