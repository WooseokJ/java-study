package b_6_access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 dc1 = new DefaultClass1(); // 같은패키지라 호출가능.
        DefaultClass2 dc2 = new DefaultClass2();
    }
}
