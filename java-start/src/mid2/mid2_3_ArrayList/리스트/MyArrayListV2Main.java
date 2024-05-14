package mid2.mid2_3_ArrayList.리스트;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 ls = new MyArrayListV2();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        System.out.println(ls); //[a, b, c, d, e] -> size=5 capacity=5
        // 문제없이 잘들어감.
        ls.add("f");
        System.out.println(ls); //[a, b, c, d, e, f] -> size=6 capacity=10
    }
}
