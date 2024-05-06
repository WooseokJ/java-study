package basic.basic_10_11_12_poly.ex1;

//public class Animal {
public abstract class Animal { // abstract로 new Animal 객체생성불가.

    public void sound() {
        System.out.println("동물 소 ");
    }
    abstract void mustSound(); // 자식클래스에서 반드시 오버라이딩 해야함.
}
