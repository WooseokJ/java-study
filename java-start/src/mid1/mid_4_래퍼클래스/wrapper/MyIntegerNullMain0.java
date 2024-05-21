package mid1.mid_4_래퍼클래스.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,3};
        System.out.println(findVal(arr, -1));; // -1
        System.out.println(findVal(arr, 0));; // 0
        System.out.println(findVal(arr, 200));; // -1 (이게 명확하진않아.)
        System.out.println(findVal(arr, 999));; // -1 (이게 명확하진않아.)

    }
    private static int findVal(int[] arr, int target) {
        for (int i : arr) {
            if(i == target) {
                return i;
            }
        }
        return -1; // 값못찾아 (보통 0 혹은 -1 사용.)
    }
}
