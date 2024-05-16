package mid2.mid2_9_MapStackQueue.map;

import java.util.*;
public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 학생 성적데이터 추가
        map.put("학생1", 90);
        map.put("학생2", 80);
        map.put("학생3", 80);
        map.put("학생4", 100);
        // 순서 x
        System.out.println(map); // {학생1=90,학생4=100, 학생2=80, 학생3=80}

        //특정학생 값 조회
        Integer score = map.get("학생1");
        System.out.println(score); // 90

        // keySet 활용 (키목록 조회)
        // Set자료구조는 순서x, 중복 x 므로 key는 Set자료구조와 같은자료구조로 저장되는것.
        Set<String> keySet = map.keySet(); // Sets아닌이유는 Set자료구조로 반환되서 Set인거
        for (String key : keySet) {
            Integer val = map.get(key);
            System.out.println("key = " + key + " val = " + val);
        }

        //key = 학생1 val = 90
        //key = 학생2 val = 80
        //key = 학생3 val = 80
        //key = 학생4 val = 100

        // Values 활용
        // 값만 꺼내는거.(순서 보장 x, 중복 허용 ) -> 순서를 보장하지않아서 List타입이아닌 Collection타입으로 반환되는거.
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
//        value = 90
//        value = 80
//        value = 80
//        value = 100

        // EntrySet활용 (하나의 Map은 여러 Entry가 저장되어있다.)
        // 순서 x, 중복x 므로 Set타입
        Set<Map.Entry<String, Integer>> entries = map.entrySet(); // key, val 쌍 담은 객체
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println("key = " + key + " val = " + val);
        }


    }
}
