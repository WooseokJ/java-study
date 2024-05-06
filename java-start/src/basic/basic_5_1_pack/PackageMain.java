package basic.basic_5_1_pack;


//import pack.p.User;
// User2를 호출하려면 또 import pack.p.User2; 해줘야해 -> 한방에 해결

public class PackageMain {

    /**
     * 쇼핑몰 시스템 개발한다 가정.
     *User, USerManage, UserHistory, Product, Order, OrderService 등
     * 사용자,사용자관리, 사용자의 어떤이력,상품, 주문, 주문서비스 등..
     * 여러개의 클래스를 만들어야한다.
     *
     * 컴퓨터는 디렉토리(폴더)라는것을통해 파일을 분리한다. 자바에서도 패키지를 통해 클래스 분류
     * 패키지는 포장묶음.
     * 패키지는 위치에 주의해야한다.
     *
     */

    public static void main(String[] args) {

        Data data = new Data(); // Data, PackageMain은 pack 이라는 같은 패키지
        // User를 생성하려면
        b_5_pack.p.User user = new b_5_pack.p.User(); //  packageMain, User는 다른패키지 이므로 전체경로 포함해서 클래스 적어줘야해.
        // import 를 통해 가져옴.(짧게 사용) import pack.p.User
        User user1 = new User();

        //만약 pack.a.User, pack.p.User를 구분할수있다.
        User user2 = new User(); //
        b_5_pack.a.User user3 = new b_5_pack.a.User(); // 만약 클래스 이름이 같으면 둘중하나는 어쩔수없이 전체 경로 써줘야해


        /*패키지의 규칙
        * 필수: 패키지 명과 위치는 실제 폴더(디렉토리) 위치와 같아야해.
        * 패키지명은 소문자, 회사 도메인 이름 거꾸로 ex) com.company.myapp   .. myapp.company.com
        * 거꾸로하는이유는 외부 라이브러리 사용시 같은 패키지,같은클래스명 충돌을 막을수있어서.
        *
        * */

        // 패키지 활용. (정답은아니야) com.helloshop 참고.
        // 보통 패키지 구성시 서로 관련된 클래스 하나의 패키지에 모으고 관련적은 클래스는 다른 패키지로 분리.


    }
}
