package mid1.mid_4_래퍼클래스.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int val =10;
        int result = compareTo(val, 5);
        int result2 = compareTo(val, 10);
        int result3 = compareTo(val, 20);

        System.out.println(result); // 1
        System.out.println(result2); // 0
        System.out.println(result3); // -1

        // 기본형은 val.compareTo()같은 메서드 만들수가없어.

    }

    public static int compareTo(int val, int target) {
        if(val < target) {
            return -1;
        }else if(val > target) {
            return 1;
        } else{
            return 0;

        }
    }
}
