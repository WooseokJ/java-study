package start.start_1_Static;

public class Data1 {
    // static 키워드는 주로 맴버변수와 메서드에서 사용.
    public String name;
    public int count;
    static public int countStatic; // static이 붙은 맴버변수는 메서드영역에서 관리., 이 맴버변수는 힙영역에 생성안된다.

    // static변수, 정적변수, 클래스변수라 불러
    // 용어정리: name, count, countStatic 다 맴버변수이다.

    /* 맴버변수 종류

    *  인스턴스 변수(static안붙은 변수) :   인스턴스 생성해야 사용가능, 인스턴스에 소속되있다., 인스턴스 만들떄 새로 만든다.
    *  클래스 변수(static 붙은 맴버변수):   인스턴스와 무관하여 클래스에 바로접근하여 사용할수있다.클래스에 소속되있다. 딱 1개만 만들어진다.(여러곳에서 공유해서사용된다.)
    정적메서드 활용: 객체생성없이 호출. 주로 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주사용.(수학 여러기능 담은 클래스만들떄같이 단순 계산하고 반환시 사용.)

    */

    /* 변수와 생명주기

     * 지역변수(매개변수포함): 스택영역에있는 스택프레임안에 생성. 메서드 종료시 함께 제거(생명주기짧아)
     * 인스턴스 변수: 힙영역에 생성되고 인스턴스에 있는 맴버변수를 인스턴스 변수라함. GC가 발생하기 전까지 생존하므로 지역변수보다 생명주기 길어.
     * 클래스 변수: 메서드 영역중 static 영역에 보관되는 변수. 프로그램 전체에서 공유해서 사용하는 영역. 해당 클래스가 JVM에 로딩되는 순간 생성되고 JVM이 끝날떄까지 생존하므로 가장긴 생명주기

        인스턴스 변수는 동적으로 생성되고 제거되지만
        static은 프로그램 실행될떄 만들어지고 끝날떄 제거되므로 말그대로 정적이다.
     * */

    public Data1(String name) { // 생성된 객체 수세기.
        this.name = name;
        count++;
        countStatic++;
    }



}
