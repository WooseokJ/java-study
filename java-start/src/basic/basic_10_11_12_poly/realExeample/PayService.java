package basic.basic_10_11_12_poly.realExeample;

public class PayService {

    private PaySystem paySystem;

    public PayService(PaySystem paySystem) {
        this.paySystem = paySystem;
    }

    public void changePaySystem(PaySystem paySystem) {
        this.paySystem = paySystem;
    }
    public void processPay(int amount) {
        if (paySystem != null) {
            paySystem.pay(amount);
        } else {
            System.out.println("error");
        }

    }
}
