package mid2.mid2_5_List.리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size); // 앞추가 , 100ms
        addMid(new ArrayList<>(), size); // 중간추가, 50ms
        ArrayList<Integer> arrayList = new ArrayList<>(); //조회용 데이터로 사용 addLast(arrayList, size);
        addLast(arrayList, size); // 뒤추가 1ms

        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size); // 앞추가 2ms
        addMid(new LinkedList<>(), size); // 중간추가 1000ms
        LinkedList<Integer> linkedList = new LinkedList<>(); //조회용 데이터로 사용 addLast(linkedList, size);
        addLast(linkedList, size); // 뒤추가 2ms

        int loop = 10000;
        System.out.println("==ArrayList 조회==");
        getIndex(arrayList, loop, 0); // index 0, 1ms
        getIndex(arrayList, loop, size / 2); // index 25000, 0ms
        getIndex(arrayList, loop, size - 1); // index 49999, 1ms

        System.out.println("==LinkedList 조회==");
        getIndex(linkedList, loop, 0); // index: 0, 1ms
        getIndex(linkedList, loop, size / 2); // //index: 25000, 400ms
        getIndex(linkedList, loop, size - 1); //index: 49999, 0ms

        System.out.println("==ArrayList 검색==");
        search(arrayList, loop, 0); // index: 0, 1ms
        search(arrayList, loop, size / 2); // //index: 25000, 100ms
        search(arrayList, loop, size - 1); //index: 49999, 200ms

        System.out.println("==LinkedList 검색==");
        search(linkedList, loop, 0); // findValue: 0, 0ms
        search(linkedList, loop, size / 2); //findValue: 25000, 400ms
        search(linkedList, loop, size - 1); // findValue: 49999, 900ms
    }
    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
