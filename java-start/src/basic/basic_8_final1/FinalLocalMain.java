package basic.basic_8_final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final은 끝이란 의미로, 변수에 붙으면 더는 값을변경할수없다는 의미.
        // final은 클래스,method,변수 여러곳에 붙을수있다.
        // final 지역변수
        final int data1 = 10; //최초한번만 할당가능
//        data1 = 3; // 수정불가 컴파일오류

        // final 매개변수
        method(10);


        // final field - 생성자로 초기화
        FieldInit f1 = new FieldInit(1); // 이떄 value값은 1로 무조건 고정.
        System.out.println(f1.value2); // 1
        // final field - 필드초기화
        System.out.println(f1.value); // 20
        //상수
        System.out.println(FieldInit.CONST_VALUE); //10

        System.out.println(Constant.PI);
        System.out.println(Constant.MOTH_DAY);

        // final은 변수값 변경못하게막는다.
        // 변수는 참조형,기본형 변수가있다.
        // final은 기본형에쓰면 변경 불가.  10,20
        // final은 참조형에쓰면 참조값은 변경 불가.   x003 , 단, 참조대상의 객체값은 변경가능.
        // x003은 못바꾸는데 그안의 변수(value)들은 바꿀수있다.

        // final Data data;
        // data = new Data(); 와 동일.  한번만 객체 담을수있다.
        final Data data = new Data();
//        data = new Data(); // 불가
        // 참조대상의 값은 변경가능
        data.value = 10;
        data.value = 20;

    }

    static void method(final int par) {
//        par = 20; // 수정불가 컴파일오류
    }


}
