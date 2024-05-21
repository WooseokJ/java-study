package mid1.mid_7_8_중첩내부클래스.정적중첩클래스;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print(); // 1
                        // 3

        System.out.println(nested.getClass()); // class mid1.mid_7_8_중첩내부클래스.정적중첩클래스.NestedOuter$Nested
    }
}
