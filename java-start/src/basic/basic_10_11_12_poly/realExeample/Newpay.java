package basic.basic_10_11_12_poly.realExeample;

public class Newpay implements PaySystem{
    @Override
    public boolean pay(int amount) {
        System.out.println("new pay 결제");
        return true;
    }
}
