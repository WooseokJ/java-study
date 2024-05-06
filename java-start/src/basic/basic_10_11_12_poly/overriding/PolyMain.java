package basic.basic_10_11_12_poly.overriding;

public class PolyMain {
    public static void main(String[] args) {
        // 다형성과 메서드오버라이딩 : 기억할것은 오버라이딩 메서드가 항상 우선권을 갖는다.

        // 부모 -> 자식 객체 참조. (오버라이딩된 메서드호출)
        Parent parent = new Child();
        parent.method(); // 메서드는 오버라이딩.: 부모의 method 실행하려하는데 자식이오버라이딩 되있으므로 우선권을 더 갖는다.
        System.out.println(parent.val); // 변수는 오버라이딩 x

    }
}
