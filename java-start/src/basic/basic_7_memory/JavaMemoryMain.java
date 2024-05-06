package basic.basic_7_memory;

public class JavaMemoryMain {
        /*
    java 메모리 구조
     메서드 스택 힙

     - 메서드: 클래스정보(A Class), static 영역(static변수담음), 런타임 상수들보관. /  프로그램에 필요한 공통데이터 관리. 모든영역에서 공유한다.
        인스턴스 생성할떄마다 메서드같은경우는 각각 생성하는게아니라
        클래스안에 메서드코드는 메서드영역의 공유된 메서드를 호출한다.


     - 스택: 실제 프로그램 실행되는영역, 메서드 실행시 하나씩 쌓임. 자바실행시 하나의 실행스택이 생성. (각 스택프레임은 main메서드 처음실행, 지역변수생성시 여기존재., 메서드호출정보 포함), 실행끝나면 해당메서드 나온다.

     스택영역은 더 정확히는 각 쓰레드별로 하나의 실행스택에 생성. 쓰레드 수만큼 스택영역이 생성.
     여러개의 쓰레드는 각각의 하나의 스택영역을 갖고있다.(쓰레드 수만큼 스택영역생성)

     멀티쓰레드 개념.
     지금까지는 자바 프로그램 실행시 프로그램이 순서대로 동작하는데
     쓰레드를 만들면 동시에 자바 프로그램을 동시에 여러개 실행할수있다.

     - 힙: 객체(인스턴스), 배열이 생성되는 영역. new 명령어 사용하면 이영역을 사용.
        GC가 동작하는 영역으로 더이상 참조안되는 객체는 GC에 의해 제거.
        new A();


        자바 메모리 구조중 스택영역에 대해 알기전에 스택이라는 자료구조에대해 알아보자
        스택: LIFO (냉장고생각)
        큐: FIFO (은행줄생각)

     */

    // 스택영역 사용.
    public static void main(String[] args) { // args: 자바프로그램 실행시 외부에서 어떤 옵션을 넣어줄수있다.그 옵셩을 읽어서 실행
        // 다음을 보면 스택구조로 실행순서가 되는걸 알수있다. LIFO(main이 가장먼저 실행해서 나중에제일 끝난다, 나중에실행된 mthod2가 가장빨리 끝난다. )
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static  void method1(int a) {
        System.out.println("m1 start");
        int cal = a * 2;
        method2(cal);
        System.out.println("m1 end");
    }
    static  void method2(int a) {
        System.out.println("m2 start");
        System.out.println("m2 end");
    }
}
