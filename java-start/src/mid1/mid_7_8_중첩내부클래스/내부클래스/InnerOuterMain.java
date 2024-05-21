package mid1.mid_7_8_중첩내부클래스.내부클래스;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter(); // x001
        InnerOuter.Inner inner = outer.new Inner(); // 참조(outer) 필수!! x001.newInner()
        // 내부클래스는 new 바깥클래스인스턴스참조.내부클래스()로 생성가능.

        inner.print(); // 1 3 2
        System.out.println(inner.getClass()); // InnerOuter$Inner
    }
}
