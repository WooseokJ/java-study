package b_6_access.b;

import b_6_access.a.AccessData;

public class AccessDataMain {
    public static void main(String[] args) {
        AccessData data = new AccessData(); // access.a 패키지의 AccessData 임.
        // public
        data.publicField = 1;
        data.publicMethod();
        data.innerAccess(); //public

        // 다른 패키지(access.a) default 호출 불가.
//        data.defaultField = 1; // error
//        data.defaultMethod(); // error

        // private 다 안됨.
//        data.privateField = 1; //

    }
}
