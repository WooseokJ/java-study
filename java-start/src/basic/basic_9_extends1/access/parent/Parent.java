package basic.basic_9_extends1.access.parent;

public class Parent {
    public int publicVal;
    protected int protectedVal;
    int defaultVal;
    private int privateVal;

    public void publicMethod() {
        System.out.println("parent, publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("parent, protected");
    }
    void defaultMethod() {
        System.out.println("parent, default");
    }
    private void privateMethod() {
        System.out.println("parent, privete");
    }
    public void print() {
        System.out.println("publicVal: "+publicVal);
        System.out.println("protectedVal: "+protectedVal);
        System.out.println("defaultVal: "+defaultVal);
        System.out.println("privateVal: "+privateVal);


        defaultMethod();
        privateMethod();
    }

    public String value = "parent";
    public void hello() {
        System.out.println("parent hello");
    }

    public Parent() {
        System.out.println("Parent 생성자");
    }



}
