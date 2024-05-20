package mid2.mid2_5_List.리스트;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> ls = new MyArrayList<>();
        BatchProcessor processor = new BatchProcessor(ls);
        processor.complexLogin(50000);

        MyLinkedList<Integer> ls2 = new MyLinkedList<>();
        BatchProcessor processor2 = new BatchProcessor(ls2);
        processor2.complexLogin(50000);

    }
}
