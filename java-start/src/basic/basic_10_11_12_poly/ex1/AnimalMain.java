package basic.basic_10_11_12_poly.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

//        soundDog(dog);
//        soundCat(cat);
//        caw.sound();

//        Caw[] cawArr = {dog, caw, cat}; 타입이달라 넣을수가없다(그래서 다형성사용) 문제의핵심은 타입이 다르다는것!, 서로 다른타입을 하나의 타입으로 맞출수있다.


        // 다형성 사용.(메서드 오버라이딩)
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        Animal animal = new Cat();
        animal.sound();

        System.out.println();
        // 배열+ for문 활용.
//        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};와동일.
        Animal[] animalArr = {dog,cat,caw};
        for (Animal animal1 : animalArr) {
            animalSound(animal1); // 범위선택한뒤 command+option+M 하면 메서드만들어줘.
        }

        // 다형성 사용시 생길문제점.
        // 1.Animal 클래스 생성할수있는문제: 동물은 추상적인개념이라 객체생성하여 사용할일이있을까?
        // 2.sound 메서드를 깜빡하고 오버라이딩 안할수도있는 문제.
        // 1,2 해결위해 추상클래스사용.

        // 추상클래스 abstract class Aniaml : 일반클래스와 동일한데 new Animal()같이 직접 인스턴스 생성못해.
        // 추상메서드: 반드시 자식클래스가 오버라이딩 해야하는 메서드를 부모클래스에서 정의.(메서드에 바디(괄호)가없다) abstract void mustSound();
        // 단 추상클래스가 있어야 추상메서드를 만들수있다.
        // 추상클래스로 실수로 Animal 객체생성 방지.
        // 추상메서드로 실수로 mustSound 오버라이딩 꼭 하게 만듬.



    }

    private static void animalSound(Animal animal1) {
        animal1.sound(); //
    }

    // 아래것들 잘못된짜고있는방식.
    private static void soundCat(Cat cat) {
        cat.sound();
    }
    private static void soundDog(Dog dog) {
        dog.sound();
    }

    // 다형성 사용
    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
