package start.start_1_Static;

public class DecoUtil {
    // 인스턴스 메서드: 인스턴스 생성해야 호출가능
    public String deco(String str) { // 문자열 꾸미는 기능
        return "* " + str + " *";
    }
    // 클래스 메서드: 인스턴스 생성없이 호출가능. (메서드만 호출할거면 static 붙이자)
    public static String deco2(String str) { // 문자열 꾸미는 기능
        return "static: * " + str + " *";
    }

    private int instanceValue;
    private static  int staticValue;
    static void staticCall() {
        // staticCall은 클래스 소속인데 인스턴스 변수나 메서드는 인스턴스 만들고나서 그떄서야 힙영역에 만들어지므로 만들어지지도않은 인스턴스에 참조값으로 접근이 불가능해서.

//        instanceValue++; // 인스턴스 변수 접근불가 complie error
//        deco("1");  // 인스턴스 메서드 접근불가 complie eror

        staticValue++;  // 정적 변수 접근 가능.
        deco2("1"); //정적 메서드 접근 가능.
    }

    void instanceCall() { // 전부다 접근가능.
        instanceValue++;
        deco("1"); // DecoUtil.deco("1") 와 동일
        staticValue++;
        deco2("!"); // DecoUtil.deco2("1") 와 동일
    }

    static void staticCall(DecoUtil data) { // 객체의 참조값을 매개변수로 전달하면 정적메서드여도 인스턴스 변수나메서드 호출가능.
        data.instanceValue++;
        data.deco("1");
    }


}
