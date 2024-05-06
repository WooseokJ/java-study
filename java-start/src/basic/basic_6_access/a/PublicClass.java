package b_6_access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass(); // 아무대서나 가능
        DefaultClass1 dc1 = new DefaultClass1(); // 같은 패키지안이라서 가능.
        DefaultClass2 dc2 = new DefaultClass2();


    }
}

class DefaultClass1 {}
class DefaultClass2 {}
