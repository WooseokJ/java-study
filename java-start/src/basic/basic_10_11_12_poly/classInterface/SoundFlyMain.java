package basic.basic_10_11_12_poly.classInterface;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(bird);

//        flyAnimal(dog); //안됨.
        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
    }
    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
