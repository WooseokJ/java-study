package mid2.mid2_10_순회정렬총정리.compare;

import java.util.*;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        List<MyUser> ls = new ArrayList<>();
        ls.add(user1);
        ls.add(user2);
        ls.add(user3);

        ls.sort(null); // 별도의 비교자 없으므로 Comparable로 비교해서 정렬.
        System.out.println(ls);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        Collections.sort(ls);
        System.out.println(ls);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]



        ls.sort(new IdComparator());
        System.out.println(ls);
//        [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]


        ls.sort(new IdComparator().reversed());
        System.out.println(ls);
        // MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        Collections.sort(ls, new IdComparator());
        System.out.println(ls);
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]



    }
    public static class IdComparator implements Comparator<MyUser> {
        @Override
        public int compare(MyUser o1, MyUser o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }
}
