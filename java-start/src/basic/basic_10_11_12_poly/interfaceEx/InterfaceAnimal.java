package basic.basic_10_11_12_poly.interfaceEx;

public interface InterfaceAnimal {
    // interface에서 맴버변수는 public, static, final이 포함되었다고 생각하자.

//    int PI = 3.14; // public static final int PI = 3.14; 동일.
    // 상수정도는 넣어둘수있다., 변수는 안됨.

    // 상속관계는 UML에서 실선, interface는 UML에서 점선.
    // interface를 상속한다가아니라 구현한다로 표현.(상속과동일)

    void sound(); // public abstract void sound() 동일.
    void move();
}
