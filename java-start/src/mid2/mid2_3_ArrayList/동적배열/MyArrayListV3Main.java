package mid2.mid2_3_ArrayList.동적배열;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 ls = new MyArrayListV3();
        //맨뒤에 추가 add(val) - O(1)
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        System.out.println(ls); // [a, b, c, d]

        //원하는 위치 추가 add(index, val) - O(n)
        ls.add(0,"QQ");
        System.out.println(ls); // [QQ, a, b, c, d]

        // 삭제 -O(n)
        System.out.println(ls.remove(1)); // a
        System.out.println(ls); // [QQ, b,c,d]


    }
}
