package mid1.mid_7_8_중첩내부클래스.정적중첩클래스;

public class NestedOuter {
    private static int couClassVal = 3;
    private int outInstanceVal = 2;

    // 정적 중첩클래스
    static class Nested {
        private int nextedInstanceVal = 1;

        public void print() {
            //자신의 맴버에 접근
            System.out.println(nextedInstanceVal);

            // NestedOuter 인스턴스 맴버에 접근
            // 접근불가. (Nested가 static인데 static은 당연히 인스턴스에 접근불가능)
            // 인스턴스는 인스턴스영역에생김, static은 메서드영역에생김.
//            System.out.println(outInstanceVal);

            // NestedOuter의 클래스 맴버에는 접근가능(private도 접근가능)
            System.out.println(couClassVal); // 접근가능.

        }
    }
}
