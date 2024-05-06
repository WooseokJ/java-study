package basic.basic_10_11_12_poly.realExeample;

public class PayMain {
    public static void main(String[] args) {
        KakaoPay kakaoPay = new KakaoPay();
        PayService payService = new PayService(kakaoPay);
        payService.processPay(1000);

        NaverPay naverPay = new NaverPay();
        payService.changePaySystem(naverPay);
        payService.processPay(100);

        payService.changePaySystem(new Newpay());
        payService.processPay(100);
    }
}
