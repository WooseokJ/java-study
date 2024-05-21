package mid1.mid_7_8_중첩내부클래스.정적중첩클래스.ex1;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
