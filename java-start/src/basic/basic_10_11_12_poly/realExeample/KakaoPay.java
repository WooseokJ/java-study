package basic.basic_10_11_12_poly.realExeample;

public class KakaoPay implements PaySystem {

    @Override
    public boolean pay(int amount) {
        System.out.println("카카오페이 결제");
        return true;
    }

}
