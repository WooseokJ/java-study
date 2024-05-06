package b_6_access.b;

public class AccessData {
    public int publicField;
    int defaultField;
    private int priveFeild;

    public void publicMethod() {
        System.out.println("publicmethod: " + publicField);
    }
    void defaultMethod() {
        System.out.println("defaultMethod: "+ defaultField);
    }
    private void privateMethod() {
        System.out.println("privateMethod: " + priveFeild);
    }

    public void innerAccess() { // 클래스안에서는 접근제어 관계없이 다 접근가능.
        System.out.println("내부 호출");
        priveFeild = 10;
        defaultField = 10;
        priveFeild = 10;
        publicMethod();
        defaultMethod();
        privateMethod();

    }

}
