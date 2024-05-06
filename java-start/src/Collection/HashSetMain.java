package Collection;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        // 순서, 중복 x
        // Hashset: 객체 저장하기전 기존에 같은객체 있는지 확인., 없으면 저장, 잇으면 저장안해
        HashSet map = new HashSet();
        map.add("abc");
        map.add("abc");// 저장 안됨.
        map.add(111);
        map.add(222);
        System.out.println(map); // 순서보장 x


        HashMap map2 = new HashMap();
        map2.put("key1", 10); // ("key", new Integer(10));
        Set set = map2.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
