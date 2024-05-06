package basic.basic_10_11_12_poly.interfaceEx;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스는 추상클래스와 같다. 여기서 편의기능이 몇개더 추가.
        // 공통: 객체생성x, 상속시 모든메서드 오버라이딩, 다형성위해 사용.

        // 인터페이스 메서드는 모두 public, abstract이다.
        // public abstract 생략가능.
        // 다중상속지원.

        // 인터페이스 객체생성불가.
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Dog dog = new Dog();
        soundAnimal(dog);


        // 상속: 부모클래스 기능을 자식이 사용할떄 상속이라함.
        // 구현: 부모 인터페이스 기능을 자식이 재정의해서 사용할떄 구현.
        // 인터페이스 사용이유(순수추상클래스로 안쓰고 )
        // 1. 제약 : 인터페이스를 구현하는곳에서 추상메서드를 반드시 구현해야하는 규약(제약)을 주는것., 미래에 누군가 실행가능한 메서드를 끼워넣을수도있고
        // 그 메서드를 자식에서 구현하지않을수도있고 또 추가되는순간 순수추상클래스가 아니게된다., 하지만 인터페이스는 모든 메서드가 추상메서드이다.
        // ex1.Animal의 sound처럼 추상메서드 아닌것들이 추가될수있다.
        // 2. 다중구현 : 클래스 상속은 부모하나만 지정가능한데 인터페이스는 여러 부모를 두는 다중구현이 가능하다.

        // 인터페이스: 강력하게 모든 메서드가 추상메서드이다.
        // 추상클래스: 추상메서드 or 추상메서드아닌것 둘다 가능.


        // 자바가 다중상속 지원안하는이유: 동일한 메서드를 상속받게되면 상위클래스중 어떤것을 사용해야할지 모를떄 (다이아몬드 문제 발생해서), 클래스 계층구조 복잡해질것 막으려고
        // 인터페이스는 다중상속허용한게 모든 추상메서드로 이루어져있어서.
        // 각 인터페이스를 구현한 클래스에서 그 구현된 메서드가 호출되므로 다이아몬드 문제가 절대 발생안해.

        InterfaceA a = new Child();
        a.methodA(); //  child MethodA
        a.methodCommon(); // child MethodCommon

        InterfaceB b = new Child();
        b.methodB(); // child MethodB
        b.methodCommon(); // child MethodCommon



    }

    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
    }
}

