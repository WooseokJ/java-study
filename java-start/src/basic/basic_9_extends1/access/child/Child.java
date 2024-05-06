package basic.basic_9_extends1.access.child;

import basic.basic_9_extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicVal = 1;
        protectedVal = 1; // 상속관계(부모) or 같은패키지(access) 이면 가져올수있다.
//        defaultVal = 1;  다른 패키지 접근불가. complie error
//        privateVal = 1;  접근불가 complie error

        // 메서드도 마찬가지
        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        print(); // 이건가능.


    }



    // super란?
    // 부모와 자식의 필드명(변수명 or 상수명)이 같거나 매서드가 오버라이딩 되어있으면 자식에서 부모의 필드나 메서드호출못해.
    //이때 super 키워드로 부모를 참조할수있다.
    // 주로 부모클래스의 메서드나 필드 호출시 사용.

    public String value = "child"; // 부모도 동일한 변수같고잇어

    @Override
    public void hello() { // 부모도 동일한 메서드있어.
        System.out.println("child hello");
    }

    public void callSuper() {
        System.out.println("this.value" + this.value);
        System.out.println("super.value" + super.value);

        this.hello(); // 보통 this는 생략한다.
        super.hello();
    }



    public Child() {
//        super(); // 부모클래스가 매개변수가 없는 기본생성자의 경우 생략가능.(자바가자동으로 생성) 숨겨져있다생각해라.

        // super로 자식 생성자안에서 언젠가 한번은 호출되어야한다.
        // ex) 아래 Child(int a)에서 super 호출.
        this(1);
        System.out.println("child 생성자");
    }

    public Child(int a) {
        super(); // 항상호출
        System.out.println("chaild 생성자 a= " + a);
    }


}
