package basic.basic_8_final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //static final이 붙으면 대문자로 관례 상수이다.
    final int value = 20; // 이렇게하면 모든 인스턴스값이 모두 같은값이므로 메모리낭비하게됨., 그래서 바뀌지않는 값이므로 공용으로 사용하면되겠다해서 static final 형태로 많이사용한다.
    final int value2;
    public FieldInit(int value) { // value2는 생성자통해 딱한번 초기화가능
//        this.value = value; //이거안됨.(이미 초기값있어서)
        this.value2 = value;
    }

    // 상수는 변하지않고 항상일정한값을 갖는것.
    // 상수는 static final 키워드쓴다., 변수명은 다 대문자, 언더스코어로 씀.(관례)
    // 상수값자체를 사용하는게 목적.


}
