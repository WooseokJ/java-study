package mid2.mid2_9_MapStackQueue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque); // [1,2,3]

        // 꺼내지않고 조회만
        System.out.println(deque.peek()); // 1

        // 꺼내기
        System.out.println(deque.poll()); // 1
        System.out.println(deque.poll()); //2
        System.out.println(deque.poll()); // 3
        System.out.println(deque); // []
    }
}
