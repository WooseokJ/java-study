package basic.basic_10_11_12_poly;

public class PolyMain {

    /*
    * 다형성은 다양한형태,여러형태를 뜻함.
    *  한객체가 여러 타입의 객체로 취급될수있는것을 의미.
    * 하나의 객체는 하나의 타입으로 고정되어있지만 다형성을 사용하면 다른타입으로 사용될수있다.
    *
    *
    * 다형적참조, 메서드 오버라이딩
    *
    * */


    public static void main(String[] args) {
        // 부모 변수가 자식 객체 참조
        System.out.println("parent -> parent ");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 객체 참조
        System.out.println();
        System.out.println("child  -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모타입의 변수가 자식 객체 참조가능(=다형적 참조)
        //
        System.out.println();
        System.out.println("parent -> child");
        Parent poly = new Child(); // 부모는 자식을 담을수있다 생각!!
        // Child poly = new Parent(); // 컴파일 error
        poly.parentMethod();

//        poly는 Parent타입이라 childMethod를 몰라 호출불가.
        // 부모에서 자식 호출못해.(상속관계는 자식은 부모꺼 호출되지만 반대는 안됨.)
//        poly.childMethod(); 호출못해.

        // 그러면 childMEthod 호출하고싶으면 어떻게해야할까? -> 다운캐스팅(부모타입 -> 자식타입).
        Child child1 = (Child) poly; // 다운캐스팅 (복사해서 읽는거다)
        child1.childMethod();

        // Child child1 = (Child ) x001 // 참조값을 읽은 다음 자식타입으로 지정 해서 child1에 넣어준다.

        // 부모는 자식을 담을수있지만 자식은 부모 담을수없다.
        // Parent parent = child

        // 일시적 다운캐스팅 , 별도의 변수 선언해서 복사안하고 해결. : 해당 메서드 호출시 순간만 다운캐스팅.
        ((Child) poly).childMethod(); // 임시로 다운캐스팅 호출.(poly가 child타입으로 바뀌는건 아니다.)

        Parent parent1 = (Parent) child1; //업케스팅은 (Parent) 생략가능. 생략권장.


        // 다운캐스팅 주의점: 다운캐스팅 잘못하면 런타임에러나옴.
        // 다운캐스팅을 자동으로 하지않는 이유
        // 문제없음
        Parent parent2 = new Child();
        Child child2 = (Child) parent2;
        child2.childMethod(); // 문제없음

        // 문제생겨(주석해제)
        Parent parent3 = new Parent();
//        Child child3 = (Child) parent3; // 런타임 오류 - ClassCastException: 인스턴스없는데 접근하면 나오는 에러.
//        child3.childMethod(); // 실행불가

        /*   Parent parent3 = new Parent();
        이는 Child 가 존재하지않으므로 다운캐스팅이 안된다.

        Parent parent2 = new Child();
        이는 Child, Parent 둘다있으므로 다운캐스팅 가능.
        *
        * */

        // 업캐스팅이 안전하고 다운캐스팅이 위험한이유: 업케스팅은 이런경우 생기지않는다.
        // 자식 객체 생성시 부모 객체도 생성되므로


        // A(부모) -> B -> C(자식) 순서로 일떄
        /*
            A a = new B();   A로 업케스팅
            B b = new B();   자신과같은타입
            C c = new B();   하위타입은 대입불가 (컴파일에러)
            C c = (C) new B(); // 강제 다운캐스팅. (단, c에는 C관련 메서드나 변수접근시 런타임에러)

        *
        * */

        // 컴파일 오류 VS 런타임 에러.
        // 컴파일오류: 자바 프로그램 실행전에 발생하는 오류 (보통 IDE에서 확인가능하므로 안전한오류)
        // 런타임오류: 프로그램이 실행되고있는 시점에 발생하는 오류(고객이 프로그램 실행중 발생하기떄문에 안좋은오류)


        // instanceOF: 참조변수가 어떤 인스턴스 참조하는지 확인(실제 인스턴스 타입확인)
        Parent parent4 = new Parent();
        Parent parent5 = new Child();
        call(parent4); //  new Parent instanceof Child 가됨.
        call(parent5); //  new Child instanceof Child 가됨.








    }
    private static void call(Parent parent) {
        if (parent instanceof Child) { // 이렇게 다운캐스팅하기전에 확인하고 다운캐스팅하는게 안전.
            System.out.println("====");
            System.out.println("Child 인스턴스야.");
            // child 인스턴스이므로 childMethod 호출가능
            Child child = (Child) parent;
            child.childMethod();

        }
        // instanceof: 오른쪽 대상의 자식타입을 왼쪽에서 참조하는경우도 true 반환. ( 오른쪽 타입에 왼쪽타입에 들어갈수있는지에따라 true/false결정)
        // new Parent instanceof Parent
        // new Child instanceof Parent

        // java16 이후 - pattern Matching for instanceOf: instanceOf 사용하면서 동시에 변수선언가능.
        if(parent instanceof Child ii) { // ii 는 Child타입으로  Child child = (Child) parent; 과정생략.
            ii.childMethod();
        }
    }




}
