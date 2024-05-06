package basic.basic_1_2_Class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String name1 = "학생1";
        int age1 = 15;

        String name2 = "학생2";
        int age2 = 16;


        // 학생 추가할떄마다 계속 추가해줘야해
        // 배열 사용: 인덱스 잘못보고 변경시 문제가 커진다. 변경도 각각해줘야한다. -> 그래서 학생이라는 클래스로 관리하자.
        String[] students = {"학생1", "학생2"};
        int[] ages = {15,16};


        // 학생이라는 타입을 만들면되지않을까? -> 클래스 사용해서 int, String같은 타입을 직접만들수있다.
        // 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도(클래스)가 필요하다.
        // 설계도를 갖고 만드는것을 객체(=인스턴스) 라 한다.

        StudentClass s1 = new StudentClass();
        s1.name = "학생1";

        StudentClass s2 = new StudentClass(); // 객체생성하면 메모리 어딘가에 있는 이객체에 접근할수있는 주소값이 반환되어 s2에 넣어진다.
        s1.name = "학생2";

        System.out.println(s2); // Class1.StudentClass(전체경로) @30f39991 // SudentClass의 참조값
        System.out.println(s1); // Class1.StudentClass @452b3a41  s1의 주소값으로 메모리에있는 객체에 접근가능.

        // 객체에 값을 대입하려면 객체에 접근(. 키워드로 객체에 접근)
//        30f39991.student = "학생1';

        // 클래스: 객체가 가져야할 속성(변수)와 기능(메서드)를 정의한다.
        // 객체: 클래스에서 정의한 속성과 기능을 가진 실체. 독립적인 상태를 갖는다.(s1,s2는 같은 클래스로 만들었지만 다른 객체)
        // 인스턴스: 특정 클래스로부터 생성된 객체를 의미.(객체와 같은개념이다. 구분안해도됨.) , 근데 s1객체는 studentClass 클래스의 인스턴스다 라고 말한다.


        // 객체를 담는 배열 배열
        StudentClass[] sts = new StudentClass[2]; // 객체를 담는 배열.(참조값(주소값)을 보관한다,)
        StudentClass[] sts2 = new StudentClass[]{s1, s2}; // 위와 동일.
        StudentClass[] sts3 = {s1, s2}; // 위와 동일.
        /** 핵심:  자바에서 대입은 변수에 들어있는 값을 복사한다.*/
        sts[0] = s1;
        sts[1] = s2;

        s1.name = "변경";
        System.out.println(sts[0].name); // 변경. (주소값을통해 변경하였으므로.)



        // 기본형과 참조형 복사
        int a =  10 ;
        int b = a ; // 이떄 a의 값(10)을 복사해서 대입하는것
        a = 20 ;
        // a는 20 , b는 20이다.

        StudentClass stu1 = new StudentClass();
        StudentClass stu2 = stu1; // 이는 참조할 주소값을 복사해서 넣어준다. 하나의 인스턴스를 가리키는 참조 변수가 두개이다.
        System.out.println(stu1 + " " + stu2);
        stu1.age = 10;
        // stu1.age는 10 , stu2.age도 10

        // 메서드 호출에서 위와 동일하다. 파라미터도 복사해서 전달한다. s = stu1 인거.
        chage(stu1);
        System.out.println(stu1.age + " " + stu2.age); // 333 333 나옴.


        // 변수값의 초기화
        /**
         * 맴버 변수: 자동초기화, 인스턴스의 맴버변수는 인스턴스 생성시 자동으로 초기화., int a 선언시 0 으로 자동으로 초기화 ., boolean이면 false로 초기화., 참조형이면 null
         * 지역변수: 수동초기화, 항상 직접 초기화 해줘야해.
         */

        // null: 참조형변수에는 항상 참조값이 있어야한다. 근데 나중에 입력하고싶을떄 사용.
        StudentClass sample1 = null; //참조값없어.,
        sample1 = new StudentClass(); //참조값 넣어줌.
        System.out.println(sample1); // 아래와 달라져 1fb3ebeb
        sample1 = null; // 다시 비워줘.
        sample1 = new StudentClass(); // 다시 넣어줌.
        System.out.println(sample1); // 위와 달라져 548c4f57

        // GC(가비지컬렉션): 아무도 참조하지않는 인스턴스는 접근이 불가능한데 메모리에 올라가있으므로 메모리낭비가 생길수있다. 자바는 이러한걸 자동으로 처리한다. java실행하면 JVM(자바버추어머신)의 GC가 런타임에 참조하지않는 인스턴스를 자동으로 메모리에서 제거.
        // 참고로 ARC와 GC둘다 메모리 관리 자동화이지만 ARC는 컴파일에 작동 및 참조카운팅 기반. GC는 런타임에 작동하고 더 동적인 메모리관리 제공.(프로그램 실행되는동안 지속적으로 메모리 관리를한다.)
        // 사람이 직접 메모리할당해제 하는것보다 GC에서 한번에 모아서 해제한다.

        // NullPointerException(가장많이 보는 예외) : 택배보낼떄 주소지없이 택배배송 (참조값없이 객체 찾아가면 어떤문제 발생하나?)
        // null값에 .을찍어서 접근해서 에러가 발생.
        // 객체를 참조할떄 . 으로 접근하는데 참조값으로 해당객체 찾아가는데 그러다가 null을 만나면 nullpinterexception을 만남.

        StudentClass sample2 = null; //참조값없어.,
//        sample2.age = 10; // NullPointerException 발생. null인데 age로 접근하므로.

        School sch = new School();
        System.out.println(sch.count); // 0
        System.out.println(sch.sc); // null
//        sch.sc.age; // NullPointerException 발생.

    }

    static void  chage(StudentClass s) {
        s.age = 333;
    }

}

class StudentClass { //  대문자 시작, 카멜케이스(낙타표기법) 사용
    String name; // 맴버변수, 필드
    int age;

}


class School {
    StudentClass sc; // null
    int count; // 0
}