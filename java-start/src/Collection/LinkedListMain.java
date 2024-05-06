package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinkedListMain {
    public static void main(String[] args) {
        // 장점: 배열은 구조간단, 데이터 읽는데 걸리는 시간짧아.(접근시간이 짧다)
        // 단점: 크기변경어렵(배열의 저장공간 부족시  더 큰 배열을 새로 만들고 복사하고 참조변경해야해), 크게만들면 메모리 공간낭비 생겨.
        // 비 순차적인(중간에) 데이터 추가,삭제에 시간많이 걸려. (장점: 단, 순차적인 추가,삭제는 빨라.)

        // 배열의 단점 보완하기위해 LinkedList 나옴
        // 불연속적으로 존재하는 데이터 연결
        // 데이터삭제: 단 한번의 참조변경만으로 가능.

        // 순차적으로 추가,삭제, 요소접근(읽기)은 ArrayList가 빨라   배열기반
        // 중간에 추가삭제는 LinkedList가 빨라   참조값 기반으로 연결 기반


        // stack , queue
        Stack stack = new Stack();
        Queue queue = new LinkedList(); // queue 인터페이스 구현체가 LinkedList

        stack.push(11);
//        stack.pop();

        queue.offer(13); // 큐 끝에 추가, false 반환하고 예외반환안해(큐가 용량제한있으면 유용), 이거사용이 좀더 좋아
        queue.add(10); // 큐의 끝에 추가, 큐가 다꽉차면 IllegalStateException 반환.
        queue.remove(10); // 10 지워져, 맨앞 제거 반환, 큐 비어있으면 예외 반환
        System.out.println(queue);
//        queue.remove();// 첫번째 값 제거.
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // 맨앞 제거 반환. 큐 비었을떄 예외처리 안하면 poll 사용, 비어있을떄 더 좋아.
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        Queue a = new LinkedList();
        System.out.println(a.poll()); // null
        a.remove();

    }
}
