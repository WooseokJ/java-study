package mid1.mid_3_String;

public class StringInfoMain2 {
    public static void main(String[] args) {
        //문자열 조작및 변환
        String str = "Hello, Java! to Java";
        System.out.println(str.substring(3)); // lo, Java! to Java
        System.out.println(str.substring(3, 8)); // 3~7까지 lo, J
        System.out.println(str.concat("!!!")); // Hello, Java! to Java!!!
        System.out.println(str.replace("Java", "World")); // Hello, World! to World
        System.out.println(str.replaceFirst("Java", "World")); // Hello, World! to Java
        String str2 = "     Java  Program   ";
        System.out.println(str2.toLowerCase()); //      java  program
        System.out.println(str2.toUpperCase()); //      JAVA  PROGRAM
        System.out.println("!" + str2.trim() + "!"); // !Java  Program!    ( 공백만 제거
        System.out.println("!" + str2.strip() + "!"); //  !Java  Program!   (공백 + 유니토드공백(특별한공백) 제거)
        System.out.println("!" + str2.stripLeading() + "!"); // !Java  Program   !   (앞쪽 공백만 제거)
        System.out.println("!" + str2.stripTrailing() + "!"); // !     Java  Program! (뒤쪽 공백만 제거)

        System.out.println();

        // 문자열 분할조합
        String str3 = "Apple,Banana,Orange";
        // split()
        String[] split = str3.split(",");
        for (String s : split) {
            System.out.println(s);
            // Apple
            // Banana
            // Orange
        }

        // join()
        // 불편한거
        String joinStr = "";
        for(int i =0; i < split.length;i++) {
            joinStr += split[i];
            if(i == split.length-1) {break;}
            joinStr += "-";

        }
        System.out.println(joinStr); // Apple-Banana-Orange

        // join()으로 편하게 바꿤
        String join = String.join("-", "A", "B", "C");
        System.out.println(join); // A-B-C

        String result = String.join("-", split);
        System.out.println(result);// Apple-Banana-Orange


    }
}
