package mid1.mid_4_래퍼클래스.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // 기본형 -> wrapper
        int val = 10;
        Integer boxedVal = Integer.valueOf(val);

        // wrapper -> 기본형
        int unboxedVal = boxedVal.intValue(); // xxxValue()


        // 오토박싱,오토언박싱 (컴파일러가 개발자대신 valueOf, xxxValue 코드를 추가해주는기능)
        int val1 = 8;
        Integer boxedVal1 = val1; // 오토박싱 (컴파일단계에서 추가)

        int unboxedVal1 = boxedVal1; // 오토언박싱.

    }
}
