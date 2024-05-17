package mid2.mid2_10_순회정렬총정리.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] arr = {user1, user2, user3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // 오름차순
        // MyUser{id='b', age=20} VS MyUser{id='a', age=30}
        // MyUser{id='c', age=10} VS MyUser{id='b', age=20}
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]


        // ID기준 정렬
        Arrays.sort(arr, new IdComparator());
        System.out.println(Arrays.toString(arr));
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

        Arrays.sort(arr, new IdComparator().reversed());
        System.out.println(Arrays.toString(arr));
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]
    }
    public static class IdComparator implements Comparator<MyUser> {
        @Override
        public int compare(MyUser o1, MyUser o2) {
            // "a".compareTo("b");
            // String이 이미 두문자중 뭐가 더 큰지 비교하는 메서드 compareTo메서드 구현해두었다.
            return o1.getId().compareTo(o2.getId());
        }
    }
}
