package basic.basic_7_memory;


public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(); // 이게 종료되면 data1이 제거. , 이떄 Data인스턴스 객체를 참조하는게 없어졌으므로(data1,2) 메모리만 차지하므로 GC가 메모리에서 제거.
        System.out.println("main end");
    }
    static  void  method1() {
        System.out.println("m1 start");
        Data data1 = new Data(10); //data가 처음엔 비어있다가 new 키워드로 인스턴스 생성시 힙영역에 Data 인스턴스 생성하고 해당 주소값이 data 지역변수가 스택영역에 저장.
        method2(data1);  // data2가 data1을 참조. , data1,2가 같은 인스턴스 참조. , method2가 종료시 data2가 제거.
        System.out.println("m2 end");
    }
    static void  method2(Data data2) { //
        System.out.println("m2 start");
        System.out.println(data2.getValue()); //
        System.out.println("m2 end");

    }
}
