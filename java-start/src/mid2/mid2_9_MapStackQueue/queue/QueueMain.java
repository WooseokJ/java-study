package mid2.mid2_9_MapStackQueue.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
//        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println("q = " + q); // 1,2,3

        // 꺼재니않고 확인만.(먼저들어간게 먼저나가니까 먼저들어간걸 확인)
        System.out.println("q.peek() = " + q.peek()); // 1
        
        // 꺼내기
        System.out.println("q.poll() = " + q.poll()); // 1
    }
}
