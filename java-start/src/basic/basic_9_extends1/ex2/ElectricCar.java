package basic.basic_9_extends1.ex2;

public class ElectricCar extends Car {
    //    public void move() {
//        System.out.println("차 이동");
//    }
    public void charge() {
        System.out.println("충전");
    }

    // 오버라이딩
    @Override // 애노테이션이라한다. 특별한 주석으로 얘가 없어도 된다.(하지만 꼭 붙이는편이다.), 없어도 동작., 만약 movee같이 오타를 내면 에러를 내주는 역할해줌.
    public void move() {
        System.out.println("전기차 빠르게 이동");
    }
    public void openDoor() {
        System.out.println("전기차 문 엽니다.");
    }


}
