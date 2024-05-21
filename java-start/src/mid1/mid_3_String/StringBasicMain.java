package mid1.mid_3_String;

public class StringBasicMain {
    public static void main(String[] args) {
        char[] charArr = new char[] {'h','i'};
        System.out.println(charArr); // hi

        // char[] 할바엔 String을 쓴다.(자바는 String클래스 제공.)


        // String클래스로 문자열 생성방법 2가지
        String str1 = "hi"; // String은 객체,클래,참조형   , 자바는 편의상 쌍따옴표로 문자열감싸면 -> new String("hi")로 변경해줌.
        String str2 = new String("hi");
        System.out.println(str1); // hi
        System.out.println(str2); // hi


        // +
        String a = "h";
        String b= "i";
        System.out.println(a.concat(b)); // hi
        System.out.println(a + b); // hi

    }
}
