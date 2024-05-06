package b_6_access.a;

public class AccessDataMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public
        data.publicField = 1;
        data.publicMethod();
        data.innerAccess(); //public

        // default
        data.defaultField = 1;
        data.defaultMethod();

        // private 다 안됨.
//        data.privateField = 1; //


    }
}
