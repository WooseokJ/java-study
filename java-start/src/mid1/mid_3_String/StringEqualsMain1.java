package mid1.mid_3_String;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hi"); // x001
        String str2 = new String("hi"); // x002
        System.out.println(str1 == str2); // false;
        System.out.println(str1.equals(str2)); // true;


        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4); // true
        System.out.println(str3.equals(str4)); // true;

    }
}
