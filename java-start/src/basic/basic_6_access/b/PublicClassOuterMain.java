package b_6_access.b;

import b_6_access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();

        // 다른패키지라서 접근불가
//        DefaultClass1  dc1 = new DefaultClass1(); // 접근불가.
//        DefaultClass2  dc1 = new DefaultClass2(); // 접근불가.
    }
}
