package mid1.mid_3_String;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "h";
        str.concat("i");
        System.out.println(str); // h  (합쳐지지않아)


        //
        String str1 = "h";
        String str2 = str1.concat("i");
        System.out.println(str1); // h
        System.out.println(str2); // hi
    }
}
