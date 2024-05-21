package mid1.mid_3_String;

public class StringInfoMain {
    public static void main(String[] args) {
        // 문자열 정보조회
        String str = "hello, java!";
        System.out.println(str.length()); // 12
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // 문자열이 비어있거나 공백인지. false
        System.out.println("     ".isBlank()); // 문자열이 비어있거나 공백인지. true
        System.out.println(str.charAt(4)); // o
        System.out.println();

        // 문자열 비교
        String str1 = "Hello, Java!"; // 대소문자 섞임.
        String str2 = "hello, java!"; // 모두 소문자
        String str3 = "Hello, World";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // false
        System.out.println("b".compareTo("a"));; // 1 (b와 a는 한칸차)
        System.out.println("c".compareTo("a"));; // 2 (c와 a는 한칸차)
        System.out.println("a".compareTo("c"));; // -2 반대이면 - 붙어.

        System.out.println(str1.compareTo(str2)); // -32
        System.out.println(str1.compareToIgnoreCase(str2)); // 0(대소문자무시하면 같은문자라 0이나온거)

        System.out.println(str1.startsWith("Hello")); // true(한글자라도 다르면 false)
        System.out.println(str1.endsWith("java")); // false( java!해야 true)
        System.out.println();

        // 문자열 검색
        String str10 = "Hello, Java! A Java world.";
        System.out.println(str10.contains("Java")); // true;
        System.out.println(str10.indexOf("Java")); // 7
        System.out.println(str10.indexOf("Java", 10 )); //15  인덱스 10부터 Java 발견되는 인덱스
        System.out.println(str10.lastIndexOf("Java")); // 15  뒤에서부터 Java 처음찾은 index 값.(
    }
}
