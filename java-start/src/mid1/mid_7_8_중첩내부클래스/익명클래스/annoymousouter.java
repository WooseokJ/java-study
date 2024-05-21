package mid1.mid_7_8_중첩내부클래스.익명클래스;


import mid1.mid_7_8_중첩내부클래스.지역클래스.LocalOuterV3;
import mid1.mid_7_8_중첩내부클래스.지역클래스.Printer;

public class annoymousouter {
    private int outInstanceVal = 3;
    public void process(int param) {
        int localVal = 1;

//        class LocalPrinter implements Printer {
//            int val = 0;
//
//            @Override
//            public void print() {
//                System.out.println(val); // 0      지역변수 (스택 프레임이 종료시 함꼐 제거)
//                System.out.println(localVal); // 1   인스턴스는 지역변수보다 더 오래 살아있어.(GC되기전까지)
//                System.out.println(param); // 2
//                System.out.println(outInstanceVal); // 3
//            }
//        }


        // 위와 동일.
        Printer printer = new Printer() { // interface의 구현체를 이름없이 만듬.
            int val = 0;

            @Override
            public void print() {
                System.out.println(val); // 0      지역변수 (스택 프레임이 종료시 함꼐 제거)
                System.out.println(localVal); // 1   인스턴스는 지역변수보다 더 오래 살아있어.(GC되기전까지)
                System.out.println(param); // 2
                System.out.println(outInstanceVal); // 3
            }
        };

        printer.print();
        System.out.println(printer.getClass()); // annoymousouter$1


    }

    public static void main(String[] arg) {
        annoymousouter annoymousouter = new annoymousouter();
        annoymousouter.process(2);
    }
}
