package mid1.mid_4_래퍼클래스.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int a = 1_000_000_000; // 10000000000와 동일. 자바에섯제공., 10억
        long start, end;
        long start2, end2;

        //기본형 Long 사용
        long sumPrimitive = 0;
        start = System.currentTimeMillis();
        for(int i =0; i< a; i++) {
            sumPrimitive+=i;
        }
        end = System.currentTimeMillis();
        System.out.println("time : " + (end-start)); // 2



        // 래퍼클래스 long 사용
        Long sumWrapper = 0L; // 래퍼할떄는 L 적어줘야해
        start2 = System.currentTimeMillis();
        for(int i =0; i< a; i++) {
            sumWrapper+=i;
        }
        end2 = System.currentTimeMillis();
        System.out.println("time : " + (end2-start2)); // 1642
    }
}
