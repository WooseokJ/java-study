package mid2.mid2_3_ArrayList.리스트;

public class MyArrayListV1Main {
    public static void main(String[] args) {
        MyArrayListV1 ls = new MyArrayListV1();

        // 데이터 추가
        ls.add("a");
        System.out.println(ls); // [a] -> size=1 capacity=5
        ls.add("b");
        System.out.println(ls); // [a, b] -> size=2 capacity=5


        System.out.println(ls.size()); //2
        System.out.println(ls.get(1)); //b
        System.out.println(ls.indexOf("b")); //1
        System.out.println(ls.set(1,"z")); // 이전값반환 b
        System.out.println(ls); // [a, z] -> size=2 capacity=5

        // 범위초과시
        ls.add("c");
        ls.add("d");
        ls.add("e");
        ls.add("f"); // error: Index 5 out of bounds for length 5

    }
}
