package mid1.mid_4_래퍼클래스.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10");// 문자열을 래퍼객체 변환.
        int intVal = Integer.parseInt("10");// 문자열전용 -> 숫자형 변환.

        //비교
        int i = i1.compareTo(20); // 10, 20 비교 : 왼쪽이 작으면 -1
        System.out.println("i = " + i); // -1

        // 산술연산
        int sum = Integer.sum(10, 20);// sum = 30



    }
}
