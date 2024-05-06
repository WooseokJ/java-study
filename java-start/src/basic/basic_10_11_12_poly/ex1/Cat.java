package basic.basic_10_11_12_poly.ex1;

public class Cat extends Animal{ // abstract 여기에 붙이면 mustSound를 구현하기싫으면 abstract 붙여주면됨., 부모에있는 mustSound가 호출되는것을 막기위함(그래서 객체못만들게막음)
//    public void sound() {
//        System.out.println("고양리 짖기");
//    }
    @Override
    public void sound() {
        System.out.println("고양이 짖기");
    }

    @Override
    void mustSound() {

    }


}
