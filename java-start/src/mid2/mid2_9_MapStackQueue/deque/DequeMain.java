package mid2.mid2_9_MapStackQueue.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(); // 이게 모든면에서 더 빨라
//        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        System.out.println("deque = " + deque); // 2 , 1

        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println("deque = " + deque); // 2 1 3 4

        // 꺼내지않고 조회만
        System.out.println("deque.peekFirst() = " + deque.peekFirst()); // 2
        System.out.println("deque.peekLast(); = " + deque.peekLast()); // 4

        // 진짜 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 2
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 1
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 4
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 3
        System.out.println(deque); // []

    }
}
