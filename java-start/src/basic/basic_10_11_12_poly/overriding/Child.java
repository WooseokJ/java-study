package basic.basic_10_11_12_poly.overriding;

public class Child extends Parent{
    public String val = "child";

    @Override
    public void method() {
        System.out.println("child method");
    }
}
