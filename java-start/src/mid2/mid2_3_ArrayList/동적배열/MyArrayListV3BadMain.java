package mid2.mid2_3_ArrayList.동적배열;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 ls = new MyArrayListV3();
        ls.add(1);
        ls.add(2);
        ls.add("a"); //문자입력
        System.out.println(ls); // [1,2,a]

        // 그냥 꺼내면  Object를 반환하므로 다운캐스팅필요
        Integer n1 = (Integer) ls.get(0);
        Integer n2 = (Integer) ls.get(1);
        // ClassCastException 예외발생.
        Integer n3 = (Integer) ls.get(2);

    }
}
