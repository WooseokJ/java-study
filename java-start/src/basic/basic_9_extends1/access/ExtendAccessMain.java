package basic.basic_9_extends1.access;

import basic.basic_9_extends1.access.child.Child;
import basic.basic_9_extends1.access.son.Son;

public class ExtendAccessMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();

        // 본인 타입 에서 찾기 -> 본인타입에 없으면(call()호출시 child에서 print() 없으므로.) 부모타입에서 찾기


        System.out.println();
        //super
        child.callSuper();

        // child , parent 각각 생성자 모두 호출되어야한다.
        Child child1 = new Child(1);
        Son son = new Son(); // 이떄 parent -> child -> son순서로 생성자가 호출된댜.





    }
}
