package basic.basic_4_Construct;

public class MethodinitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 10;  // 매번 객체 만들떄마다 이렇게 초기값을 설정해줘야해 -> 생성자 필요.


        initMember(member1, "user1", 10); // 절차지향
        member1.initMember("user1", 10); //  객체지향으로 메서드 호출
        MemberInit member2 = new MemberInit("user1", 10); //생성자로 초기화
        MemberInit member3 = new MemberInit("user1"); // 생성자 오버로딩으로 초기화.
    }

    // 절차지향
    static void initMember(MemberInit memberInit, String name, int age) {
        memberInit.name = name;
        memberInit.age = age;
    }

}


