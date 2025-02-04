package b_6_access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(80);
        speaker.volumeUp();

        System.out.println("직접접근");
//        speaker.volume = 200; // private이전에 이렇게 직접접근해서 100을 넘게 되면 폭발 만든 메서드가 소용없어짐.(이를위해 private 사용)
        speaker.volumeUp();



        //접근제어 4가지
        // private: 모든 외부호출막음, 나의 클래스안에서만 속성,메서드 호출
        // default : 같은패키지안에서 호출 허용, 나의 패키지안에서만 속성,메서드 호출
        // protected: 같은 패키지안에서 호출 허용(패키지 달라도 상속관계의 호출은 허용), 상속관계에서만 속성,메서드 호출
        // public: 모든 외부호출 공개. 어디든 호출.

        // 지역변수에는 private 못쓰고 클래스, 맴버변수(필드), 메서드에서 쓸수잇다.

        // 접근제어 사용시 패키지의 위치가 중요.

        // 클래스 레벨의 접근제어자
        // 클래스 레벨은 public class SpeakerMain 같은것.
        // 클래스레벨은 public, default 만 사용가능.
        // public 클래스는 반드시 .java 파일명과  같아야해.


        // 캡슐화: 데이터와 데이터를 처리하는 메서드를 하나로 묶어 외부에서 접근 제한하는것.
        // 캡슐화 통해 데이터 직접 변경방지 및 제한.즉, 속성,기능 하나묶고 외부에 꼭 필요한 기능만 노출, 나머지는 모두 내부로 숨김.

        // 숨겨야할것:
        // 1. 데이터 숨기기.  (Speaker의 volume) 만들어둔 메서드의 모든 로직 다 무시될수있어서
        // 2.기능을 숨기기.: 외부에서 사용하지않고 내부에서만 사용가능한 기능들이있다. 내부에서만 사용하는 기능들은 숨겨라.
        // 자동차 시동켜면 복잡한 엔진조절, 배기기능 다 컨트롤안한다(내부기능), 엑셀밡는거(외부기능)
        // 정리: 데이터는 모두 숨기기, 기능은 꼭 필요한 기능만 노출.(캡슐화가 잘되었다)

    }
}
