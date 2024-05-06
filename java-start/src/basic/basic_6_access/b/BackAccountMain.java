package b_6_access.b;

public class BackAccountMain {
    public static void main(String[] args) {
        BackAccount account = new BackAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println(account.getBalance());

        // 접근제어와 캡슐화통해 데이터 안전히 보관
        // BacnAccount 클래스 사용하는 개발자입장에서 해당기능을 사용하는 복잡도를 낮출수있다.
    }
}
