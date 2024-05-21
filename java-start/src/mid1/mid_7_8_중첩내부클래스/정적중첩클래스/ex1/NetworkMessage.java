package mid1.mid_7_8_중첩내부클래스.정적중첩클래스.ex1;

// 네트워크 객체 안에서만 사용.
// 리팩토링전
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void  print() {
        System.out.println(content);
    }
}
