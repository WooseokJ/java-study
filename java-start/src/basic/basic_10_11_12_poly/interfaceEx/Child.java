package basic.basic_10_11_12_poly.interfaceEx;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("child methodA");
    }

    @Override
    public void methodB() {
        System.out.println("child methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("child methodCommon");
    }
}
