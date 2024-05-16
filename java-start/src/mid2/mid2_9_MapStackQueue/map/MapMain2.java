package mid2.mid2_9_MapStackQueue.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        // 같은 키로 다른데이터 저장하면? -> val가 다른데이터로 변경됨.
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("A", 30); // 100 -> 30 으로 바뀜.

        boolean bool = map.containsKey("A");
        System.out.println("bool = " + bool);

        // 특정학생 값 삭제
        map.remove("A"); // 삭제

        // 학생 없는경우에만 추가 1
        map.put("B", 100);
        if(!map.containsKey("B")) { //B가 없는경우만 50추가.
            map.put("B", 50);
        }

        // 학생 없는경우에만 추가 2 ( 추가1과 동일한거)
        map.putIfAbsent("B", 50); // B가 없는경우에만 50 추가

    }
}
