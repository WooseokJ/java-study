package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
        // ArrayList에는 객체만 저장가능
        // 컴파일러가 autoboxing의해 기본형이 참조형으로 자동변환
        // list.add(new Integer(4));
        list.add(4);
        list.add(10);
        list.add(2,5); // 인덱스 2 위치에 5 넣기.
        list.add(0,1);

        ArrayList list2 = new ArrayList(list.subList(0,1)); // subList는 읽기전용
        System.out.println(list);
        System.out.println(list2);



        // list2에서 list1에 포함된 객체 삭제
        for(int i = list2.size(); i >= 0 ; i--) { //  뒤에서 부터하면 배열복사발생안해서 빨라.
            if(list.contains(list2.get(0))) {
                list2.remove(i);
            }
        }
        System.out.println("list2= "+list2);

        System.out.println(list.indexOf(10)); //해당인덱스 객체의 인덱스 반환.
        list.remove(1); // 해당 인덱스에 객체 지워짐.
        list.remove(new Integer(5)); // 이렇게하면  5 삭제
        System.out.println(list);



        Collections.sort(list); // 정렬시 사용.
    }
}
