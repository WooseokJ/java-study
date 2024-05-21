package mid1.mid_7_8_중첩내부클래스.지역클래스;

public class LocalOuterV2 {
    private int outInstanceVal = 3;
    public void process(int param) {
        int localVal = 1; //지역변수

        class LocalPrinter implements Printer {
            int val = 0;

            @Override
            public void print() {
                System.out.println(val); // 0
                System.out.println(localVal); // 1
                System.out.println(param); // 2
                System.out.println(outInstanceVal); // 3
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();

    }

    public static void main(String[] arg) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }

}
