package mid1.mid_3_String;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb); // ab

        sb.insert(3, "java"); // 3번쨰 인덱스에 java 삽입.
        System.out.println(sb); // abcjava

        sb.delete(3,7); // java지워
        System.out.println(sb); // abc

        sb.reverse();
        System.out.println(sb);//cba

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println(string); // cba
    }
}
