package mid1.mid_4_래퍼클래스.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] arr = {
                new MyInteger(-1),
                new MyInteger(0),
                new MyInteger(1), };
        System.out.println(findVal(arr, -1));; // -1
        System.out.println(findVal(arr, 0));; // 0
        System.out.println(findVal(arr, 200));; // null
        System.out.println(findVal(arr, 999));; // null

    }
    private static MyInteger findVal(MyInteger[] arr, int target) {
        for (MyInteger i : arr) {
            if(i.getVal() == target) {
                return i;
            }
        }
        return null;//값이없어서
    }
}
