package start.start_9_Method;

public class Method1 {
    public static void main(String[] args) {

        int a = 1, b = 2;
        add(a,b); // 파라미터 안에 int a,b에 각각 1,2의 값을 복사해서 전달한다.
        // 값을 복사해서 전달해주는 형태이므로 a++, b++했어도 함수빠져나오면 1,2 그대로

        // 만약 값을 넣고싶으면 반환값 변수에 넣어서 쓸수있다.


        // 형변환
        double num = 1.5;
//        getInt(num); // 오류
        getInt((int) num); // 명시적 형변환 사용.  1.5 -> 1 로 넣음. int< long < double

        int num2 = 1;
        getInt2(num2); // 이는 가능. double형이 더 큰그릇이라서 .  (형변환과 같은 개념)
    }
    // 기억: 자바는 항상 변수의값을 복사해서 전달한다.
    // public: 다른 클래스에서 호출할수있는 메서드
    // static: 객체 생성안하고도 호출할수있는 메서드
    public static int add(int a, int b) {
        a++;
        b++;
        return a + b;
    }

    public static int getInt(int a) {
        return a;
    }
    public static double getInt2(double a) {
        return a;
    }
    // void getInt2(double a = (Double) 1)
    // void getInt2(double a = 1.0)

    // 오버로딩: 메서드명은같은데 매개변수가 다른 메서드를 여러개 정의하는것. 예시로 타입이나 매개변수 개수가 다른것.
    // 오버로딩은 과적인데 과하게 물건을 담았다는듰. 같은이름으로 메서드 여러개 정의했다고 이해.
    //

    // 반환타입은 인정안됨.
    // ex) 이는 오버로딩 안됨.
    // int add(int a)
    // double add(int a)

    // 이는 오버로딩 안됨.
    // int add(int a, int b)
    // int add(int b, int a)  , int add(int c, int d) 로 생각하면됨.  , 매개변수의 타입이 다랄야해 .

    // 이는 다른메서드 (오버로딩 가능)
    // int add(int a, double b)
    // int add(double a, int b)


    // 용어 : 메서드 시그니쳐  = 메서드 이름 + 매개변수 타입(순서)
    // 오버로딩에서는 메서드 이름같아도 메서드 시그니처가 다르면 다른 메서드로 간주 .

}
