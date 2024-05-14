package mid2.mid2_3_ArrayList.리스트;


public class MyArrayListV4Main {
    public static void main(String[] args) {
        // ls는 String 문자열만 보관하고 조회.
        MyArrayListV4<String> ls = new MyArrayListV4<>();
        ls.add("a");
        ls.add("b");
        String str = ls.get(0);
        System.out.println(str);

        // ls2는 Integer 숫자만 보관하고 조회.(다른타입 넣으면 컴파일 에러로발생)
        MyArrayListV4<Integer> ls2 = new MyArrayListV4<>();
        ls2.add(1);
        ls2.add(2);
        Integer i = ls2.get(0);
        System.out.println(i);
    }
}
