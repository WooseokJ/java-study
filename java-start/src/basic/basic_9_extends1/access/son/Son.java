package basic.basic_9_extends1.access.son;

import basic.basic_9_extends1.access.child.Child;

public class Son extends Child {
    public Son() {
//        super(); // error child에서 기본생성자 없으면 super(1)같이 직접넣어줘야해.
//        super(1);
        System.out.println("son 생성자 ");
    }
}
