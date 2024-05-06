package basic.basic_3_OOP1;

public class MusicPlayerData {
    int voulme ;
    boolean isOn;


    //지금부터  객체지향으로 짜보자
    void addVoulme() { // 주의할게 static 붙이지 말자. 이유: 메서드는 객체 생성해야 호출이가능. static 붙이면 객체 생성안하고 메서드 호출가능.
        voulme += 10;
    }

    // 실제 라디오라는 객체를 켜고 끄는거같아 보인다.
    void on() {
        isOn = true;
    }
    void off() {
        isOn = false;
    }


    // 캡슐화: 음악플레이를 구성하기위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는것같다. 속성과 메서드를 묶어서 외부에서 필요한 기능을 메서드를 통해 외부에 제공하는것.

}
