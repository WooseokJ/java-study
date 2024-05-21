package mid1.mid_4_래퍼클래스.wrapper;

public class MyInteger {
    private final int val; // final 붙이면 불변

    public MyInteger(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public int compareTo(int target) {
        if(this.val < target) {
            return 1;
        }else if(this.val > target) {
            return -1;
        } else{
            return 0;

        }
    }

    @Override
    public String toString() {
        return "" + val; // 방법1. 문자 + 숫자 -> 문자반환.
//        return String.valueOf(val) //방법2. String.valudOf사용
    }
}
