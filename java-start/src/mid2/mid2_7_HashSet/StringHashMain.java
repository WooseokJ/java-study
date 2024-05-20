package mid2.mid2_7_HashSet;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        // char
        char charA = 'A';
        char chara = 'a';
        System.out.println((int) charA); // 65
        System.out.println((int) chara); // 97

        // hashCode : 문자 -> 숫자로 만듬.
        int A = hashCode("A");
        int a = hashCode("a");
        int Aa = hashCode("Aa");
        System.out.println(A); // 65
        System.out.println(a); // 97
        System.out.println(Aa); // 162

        // hashIndex : 숫자(hashCode)로 hashIndex구함.
        System.out.println(hashIndex(A)); //5
        System.out.println(hashIndex(a)); //7
        System.out.println(hashIndex(Aa)); //2
    }

    public static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    public static int hashIndex(int val) {
        return val % CAPACITY;
    }
}
