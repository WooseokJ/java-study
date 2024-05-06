package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public interface IteratorMain {
    public static void main(String[] args) {
        // Iterator, ListIterator, Enumeration: 컬렉션에 저장된 데이터 접근에 사용되는 인터페이스
        // bollean hasNect(): 읽어올 요소있는지 확인
        // Object next() : 다음 요소 읽어온다.

        List list = new ArrayList();
        for(int i= 0; i < 4; i++) {
            list.add(i);
        }

        Iterator it = list.iterator();
        System.out.println(it); // a09ee92

        while(it.hasNext()) { // 읽어올 요소가 있는지 확인 boolean
            System.out.println(it.next()); // 요소 읽어오기
        }
        while(it.hasNext()) { // 이미 한번읽어서 false되서 동작안한다.
            System.out.println(it.next());
        }
        it = list.iterator(); // 1회용이다., 이렇게해야 다시 돌았을떄 동작.


        for(int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i)); // 이렇게해서 출력되지만 HashSet같은경우로 바꾸면 get 이 없어서 안먹힘.
            // 그래서 위와같이 iterator로 조회가 좋은거. (변경이 적어서)
        }

        HashSet list2 = new HashSet(); // Set은 collection의 자손.
        Iterator it2 = list2.iterator();
        it2.hasNext();

        // List, Set은 collection 인터페이스를 구현하고있다.
        // map은 아니므로 KeySet, EtrySet, values를 호출해서 iterator를 사용할수있다.

    }
}
