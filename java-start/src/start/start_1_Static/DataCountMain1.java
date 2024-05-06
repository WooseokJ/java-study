package start.start_1_Static;


public class DataCountMain1 {

    public static void main(String[] args) {
        // static 키워드는 주로 맴버변수와 메서드에서 사용.
        Data1 data1 = new Data1("A");
        System.out.println(data1.count + " " + data1.countStatic); //1 1  // count는  각인스턴스 count는 공유되지않는다. 그래서 변수를 공유해야한다(countStatic)
        Data1 data2 = new Data1("B");
        System.out.println(data2.count+ " " + data2.countStatic); // 1 2
        Data1 data3 = new Data1("C");
        System.out.println(data3.count+ " " + data3.countStatic); // 1 3
        // data3.count 는        인스턴스 통한 접근 ,
        // Data1.countStatic  는 클래스 통한 접근
        // data1.countStatic 도 클래스통한 접근인데 권장하지않음. 이유: 코드읽을떄 인스턴스변수로인한 접근같이 보여서

        // static 메서드
        DecoUtil decoUtil = new DecoUtil();
        String str = "welcome";
        String deco = decoUtil.deco(str);
        System.out.println(deco);
        System.out.println(DecoUtil.deco2(str));

        // 정적메서드는 언제나 사용할수있는게 아니다.
        /*
        * static 메서드는 클래스내부에서 기능 사용할떄 static 붙은 메서드나 변수만 사용가능,
        *  즉, 인스턴스 변수나 인스턴스 메서드 사용불가.
        * 반대로 static 붙은건 모든곳에서 호출가능.(단,접근제어는 가능해야해)
        * */

        DecoUtil.staticCall(); // 정접메서드호출
        decoUtil.instanceCall(); // 인스턴스 메서드호출

        // import Static.DecoUtil.* 해주면 아래와같이 줄여서호출가능. (option + enter)
//        staticCall();
//        staticCall();
//        staticCall();



    }
}
