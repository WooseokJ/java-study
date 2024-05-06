package basic.basic_3_OOP1;

public class MusicPlayerMain1 {
    /*
     * 절차지향 플밍
     * 실행 순서를 중요하게 생각하는 방식: 프로그램 흐름을 순처적으로 처리하는 방식.
     * 객체지향
     * 객체를 중요하게 생각하는 방식: 실제 사물,사건을 객체로 보고 이러한 객체간 상호작용 중심으로 프로그래밍하는 방식.
     *
     * 차이점
     * 절차는 데이터와 해당데이터 처리방식(기능)이 분리                 : 어떻게 순차적으로 처리할지에 초점
     * 객체는 데이터와 데이터의 행동들(메서드들)이 하나의 객체안에 포함.    : 속성과 기능을 잘묶어서 객체를 어떻게 만들지 초점.
     *
     * */

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 절차지향 프로그래밍.
        // 플레이 켜기
        isOn = true;
        // 볼륨 증가
        volume++;
        // 플레이 끄기
        isOn = false;

        // 절차지향 프로그래밍 - 데이터 묶기, 메서드 호출.
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true; // 데이터 직접 바꾸기
        data.voulme++;
        volumeUp(data); // 볼륨 +10 올림. 이것도 절차지향
        data.isOn = false;

        // 각각의 기능을 메서드로 만들어서 모듈화가 되어있다. (하나의메서드는 하나의 기능을 쓰고있다)
        // 중복로직이 제거(같은 로직이면 메서드 여러번 호출), 변경이 쉽다.(기능수정시 메서드 내부만 수정)
        // 메서드 이름추가(메서드 이름통해 코드이해가 쉬워진다.)
        // 절차 지향 프로그램 한계: 데이터와 기능이 분리되어있다. (데이터는 MusicPlayerData 클래스안에있는데 기능은 MusicPlayerMain1 작성되어있다.)
        // 데이터와 기능은 매우 연관되어있는데 각 메서드는 MusicPlayerData 의 데이터를 사용하는데 데이터변경시 만든 매서드들도 변경해야한다. (수정이 많이일어남), 예를들어 volume2로 변수명바꾸면 다른것도 다바꿔야해.
        // 이를 위해 객체지향 프로그래밍이 나와 해결.(데이터와 기능을 하나로 묶음)


        // 클래스는 맴버변수와 메서드를 포함할수있다.
        data.addVoulme();// 볼륨 +10 올림.
        // data주소를 x002라 하면 x002.addVoulme()    메서드호출시 객체 접근, addVoulme 호출 이떄 본인 인스턴스의 맴버변수(x002.vloume)에 접근.


        // 객체지향프로그래밍
        data.on();
        data.addVoulme();
        data.off();


    }


    static void volumeUp(MusicPlayerData data) {
        data.voulme +=10;
    }


}


