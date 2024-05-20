package mid2.mid2_5_List.리스트;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;

        System.out.println("==MyArrayList 추가==");
        MyArrayList<Integer> arrayList = new MyArrayList<>(); //조회용 데이터로 사용 addLast(arrayList, size);
        addFirst(new MyLinkedList<>(), size); // 앞에 추가 1349ms
        addMid(new MyLinkedList<>(), size); // 중간 추가 638ms
        addLast(arrayList, size);// 뒤에추가 2ms

        System.out.println("==MyLinkedList 추가==");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); //조회용 데이터로 사
        addFirst(new MyArrayList<>(), size); //앞에추가 2ms
        addMid(new MyArrayList<>(), size); // 중간추가 1066ms
        addLast(linkedList, size); // 뒤에 추가 2000ms


        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList, loop, 0); // index: 0, 0ms
        getIndex(arrayList, loop, size / 2); // index: 25000, 0ms
        getIndex(arrayList, loop, size - 1); // index: 49999, 0ms

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList, loop, 0); // index: 0, 1ms
        getIndex(linkedList, loop, size / 2);  // index: 25000, 400ms
        getIndex(linkedList, loop, size - 1);  // index: 49999, 800ms

        System.out.println("==MyArrayList 검색==");
        search(arrayList, loop, 0); // index: 0, 0ms
        search(arrayList, loop, size / 2);  // index: 25000, 100ms
        search(arrayList, loop, size - 1);  // index: 49999, 200ms

        System.out.println("==MyLinkedList 검색==");
        search(linkedList, loop, 0);  // index: 0, 0ms
        search(linkedList, loop, size / 2);  // index: 25000, 400ms
        search(linkedList, loop, size - 1);  // index: 49999, 900ms

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime - startTime) + "ms");
    }


}
