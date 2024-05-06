package basic.basic_10_11_12_poly.realExeample;

public class NaverPay implements PaySystem{

    @Override
    public boolean pay(int amount) {
        System.out.println("네이버 페이 결제");
        return true;
    }
}
