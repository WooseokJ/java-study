package mid2.mid2_10_순회정렬총정리.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성. (of를 쓰는건 다 불변이다.)
        List<Integer> ls = List.of(1,2,3); // 값을 못바꿔.(추가,삭제,변경 x)
//        ls.add(3); // java.lang.UnsupportedOperationException 예외 발생.(set, Map도 마찬가지로 예외터져)
        Set<Integer> set = Set.of(1,2,3);
        Map<Integer, String> map = Map.of(1,"a", 2,"b");

        System.out.println(ls.getClass()); // ImmutableCollections$ListN 불변!
        System.out.println(set.getClass()); // ImmutableCollections$SetN
        System.out.println(map.getClass()); // ImmutableCollections$MapN
    }
}
