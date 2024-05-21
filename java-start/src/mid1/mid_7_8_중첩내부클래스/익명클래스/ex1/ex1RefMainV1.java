package mid1.mid_7_8_중첩내부클래스.익명클래스.ex1;

public class ex1RefMainV1 {
    public static void hi(String str) {
        System.out.println("플밍 시작"); // 변하지않는부분
//        System.out.println("hi java");  // 변하는부분
//        System.out.println("hi spring"); // 변하는붑분
        System.out.println(str);
        System.out.println("플밍 끝"); // 변하지않는부분

        // 우선 변하는부분, 변하지않는부분 나누기. -> 상황따라 변하는부분을 문자열을 외부에서 전달받아 처리.


    }

    public static void main(String[] args) {
        hi("hi java");
        hi("hi spring");

    }
}
