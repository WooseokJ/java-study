package mid1.mid_3_String;

public class StringInfoMain3 {
    public static void main(String[] args) {
        int n = 100;
        boolean bool = true;
        Object obj = new Object();
        String str ="Hello, Java!";

        // valueOf메서드
        String numString = String.valueOf(n); // 숫자 -> 문자열
        System.out.println(numString); // 100
        String boolString = String.valueOf(bool);
        System.out.println(boolString); // true
        String objString = String.valueOf(obj);
        System.out.println(objString); // java.lang.Object@a09ee92

        // 문자 + 아무거나 -> 문자됨.
        System.out.println("" + n); // 100
        System.out.println("" + boolString); // true


        // toCharArray메서드
        char[] arr = str.toCharArray();
        for (char c : arr) {
            System.out.printf("%c ", c); // H e l l o ,   J a v a !
        }
        System.out.println();

        // format메서드
        String format = String.format("num: %d, bool: %b, str:%s", n, bool, str);
        System.out.println(format); // num: 100, bool: true, str:Hello, Java!
        String format1 = String.format("숫자: %.2f", 10.34555);
        System.out.println(format1); // 10.35

        // printf
        System.out.printf("숫자: %.2f\n", 10.34555); //10.35 printf로 바로가능.

        // matches 메서드
        String regex = "Hello, (Java!|World)"; // 레귤러 익스프레션 , 외우지마! 검색해서쓰자.
                                                // Heelo, 까진 동일 (Java!|Word) 둘중하나 들어오면 매칭
        System.out.println(str.matches(regex)); // true,


    }
}
