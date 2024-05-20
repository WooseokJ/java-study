package mid2.mid2_5_List.리스트;

public class BatchProcessor {
    // 구현체 의존 x
//    private final MyArrayList<Integer> ls = new MyArrayList<>();
//    private final MyLinkedList<Integer> ls = new MyLinkedList<>();
    // 추상체 의존 o(다형성)
    private final MyList<Integer> ls;

    public BatchProcessor(MyList<Integer> ls) {
        this.ls = ls;
    }

    // 복잡한 로직이라 가정.
    public void complexLogin(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            ls.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " +size + " 계산시간: " + (endTime - startTime ) + "ms");
    }
}
