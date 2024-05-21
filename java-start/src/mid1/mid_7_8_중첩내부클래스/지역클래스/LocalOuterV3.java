package mid1.mid_7_8_중첩내부클래스.지역클래스;

public class LocalOuterV3 {
    private int outInstanceVal = 3;
    public Printer process(int param) {
        int localVal = 1;

        class LocalPrinter implements Printer {
            int val = 0;

            @Override
            public void print() {
                System.out.println(val); // 0      지역변수 (스택 프레임이 종료시 함꼐 제거)
                System.out.println(localVal); // 1   인스턴스는 지역변수보다 더 오래 살아있어.(GC되기전까지)
                System.out.println(param); // 2
                System.out.println(outInstanceVal); // 3
            }
        }

        LocalPrinter printer = new LocalPrinter();
//        printer.print(); // 여기서 실행 안하고 Printer 인스턴스만 반환한다.
        return printer;

    }

    public static void main(String[] arg) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        //printer.print()를 나중에 실행. process(P) 스택프레임 종료후 실행.
        printer.print();
//        0
//        1
//        2
//        3
    }

}
