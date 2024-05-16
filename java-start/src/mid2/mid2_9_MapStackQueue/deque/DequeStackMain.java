package mid2.mid2_9_MapStackQueue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque); // [3,2,1]

        // 꺼내지않고 조회만
        System.out.println(deque.peek()); // 3

        // 꺼내기
        System.out.println(deque.pop()); // 3
        System.out.println(deque.pop()); //2
        System.out.println(deque.pop()); // 1
        System.out.println(deque); // []

    }
}
