package basic.basic_10_11_12_poly.abstractEx;


public class AbstractAnimalMain {
    public static void main(String[] args) {
        // 순수 추상클래스(이런용어가없긴함. interface가있어서): 추상클래스안에 모든 메서드가 다 추상클래스인것. -> 실행로직없는 부모타입의 껍데기역할 -> interface 등장.
        // 순수 추상클래스는 객체생성 x, 자식은 모든메서드 오버라이딩 해야해, 다형성위해 사용.
        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(cat);
        soundAnimal(dog);

    }
    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
    }
}
