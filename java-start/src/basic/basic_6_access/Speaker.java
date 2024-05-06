package b_6_access;

public class Speaker {
//    int volume;
    private int volume; // 외부에서 볼륨 필드를 접근불가능., 외부에서는 메서드를 통해서만 접근가능

    public Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp() {
        if(volume >= 100) {
            System.out.println("100 넘으면 폭발");
        } else {
            volume+=10;
            System.out.println("10 증가");
        }
    }

    void voulmeDown() {
        volume-=10;
        System.out.println("voulmeDown호출");
    }
    void showVolume() {
        System.out.println("현재음량: "+volume);
    }
}
