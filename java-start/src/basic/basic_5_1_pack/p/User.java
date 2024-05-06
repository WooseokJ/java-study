package basic.basic_5_1_pack.p;

public class User {
    public User() { // 다른 패키지에서 이 클래스 생성자 호출하려면 public이어야해.
        System.out.println("package.p 회원 생성");
    }
}
