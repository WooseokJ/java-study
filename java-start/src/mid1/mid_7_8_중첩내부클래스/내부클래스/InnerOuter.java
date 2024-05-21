package mid1.mid_7_8_중첩내부클래스.내부클래스;

public class InnerOuter {
    private static int outClassVal = 3;
    private int outInstanceVal = 2;

    class Inner {
        private int innerInstanceVal = 1;
        public void print() {
            // 자기 자신에 접근가능
            System.out.println(innerInstanceVal); // 1

            // InnerOuter의 인스턴스 맴버에 접근가능(private도 가능) - static안붙으면 인스턴스 맴버
            System.out.println(outClassVal); // 3

            // InnerOuter 클래스 맴버에 접근가능(private도 가능) - static붙으면 클래스맴버.
            System.out.println(outInstanceVal); // 2
        }
    }
}
