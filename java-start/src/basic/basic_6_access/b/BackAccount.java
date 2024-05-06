package b_6_access.b;

public class BackAccount {
    private int balance;


    // public 메서드 만들기: deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지않은 금액");
        }
    }
    private  boolean isAmountValid(int amount) { // 내부에서만쓰는 메서드
        // 금액이 0 보다 커야함.
        return amount > 0; // 정상적인금액
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지않은 금액");
        }
    }
    public int getBalance() {
        return balance;
    }

}
