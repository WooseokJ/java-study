package mid1.mid_7_8_중첩내부클래스;

public class ShdowingMain {
    public int val = 1;

    // 내부클래스
    class Inner {
        public  int val = 2;

        void go() {
            int val =3;
            System.out.println(val); // 3 (지역변수가 우선순위갖음)
            System.out.println(this.val); // 2 (this는 인스턴스 의미)
            System.out.println(ShdowingMain.this.val); //1
        }
    }

    public static void main(String[] arg) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();

    }
}
