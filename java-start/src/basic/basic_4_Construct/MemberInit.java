package basic.basic_4_Construct;

public class MemberInit {
    String name;
    int age;

    // 생성자 하나도 없으면 자바 컴파일러는 자동으로 매개변수없는 생성자 만들어줌(기본생성자), 아래에 생성자 만들면 기본생성자 안만들어줘서 따로 만들어줘야해 .
    MemberInit() {
        name = null;
        age = 0;
    }


    // 객체지향   : 맴버의 초기값을 설정하는 메서드
    void initMember(String name, int age) {
        this.name = name;
        this.age = age;


        // 맴버변수와 매개변수(지역변수) 이름이 같으면 안쪽에있는 매개변수가 우선순위가 더 높음.(즉 name으로 그냥쓰면 파라미터 name의미)
        // this 제거시 둘다 파라미터 name을 의미하므로 맴버변수 값이 변경안됨.
        // this쓰면 좀더 맴버변수를 쓰겠다는게 명확해짐. 최근에는 근데 구분을 더 잘하려고 맴버변수와 매개변수 다르게 씀.

    }

    // initMember같은 메서드를 매번만들어줘야해서 생성자 도입
    // 생성자는 인스턴스 생성하고 나서 즉시호출. (생성자명은 클래스명과 동일해야해 규칙임)

    //생성자 장점 : 1. 중복호출제거. 객체만들고 값넣어주는 작업이 한번에 가능., 2. 객체선언시 컴파일 오류를통해 깜빡하지않고 맴버변수들을 초기화할수있다.(생성자안쓰면 아래와같은 문제가 발생), 즉 제약을 줄수있다.
    // 생성자없어도 기본적인 null, 0 , false 같은값이 들어가면서 실행은되지만 시스템 오류가 발생할 확률이 높다.
    MemberInit(String name, int age) {
        this.name = name;
        this.age = age;


    }

    // 생성자 오버로딩과 this()
    MemberInit(String name) {
        // 구현 2 : this()로 해결 (this() 를 통해 생성자 중복을 제거할수있다.)
        // 생성자 오버로딩 블럭안에 중복되는 부분을 this()로 해결
        // 주의: this()는 생성자 코드 맨 첫줄에만 작성가능.(규칙임)
        this(name, 10); // 자기 자신의 생성자 호출. (31번쨰 생성자 호출)

        // 구현 1
//        this.name = name;
//        this.age = 10;

        // this(name,10) // 에러나와.
    }



}
