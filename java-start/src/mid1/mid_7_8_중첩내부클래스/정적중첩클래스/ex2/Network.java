package mid1.mid_7_8_중첩내부클래스.정적중첩클래스.ex2;


// 리팩토링후
public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    public static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void  print() {
            System.out.println(content);
        }
    }
}
