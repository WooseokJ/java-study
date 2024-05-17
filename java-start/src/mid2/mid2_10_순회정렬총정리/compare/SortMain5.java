package mid2.mid2_10_순회정렬총정리.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {

        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        System.out.println(treeSet); // 정렬되서 들어간거 확인.
        //[MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println(treeSet2);
        //[MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]
    }

    public static class IdComparator implements Comparator<MyUser> {
        // 오름차순
        @Override
        public int compare(MyUser o1, MyUser o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }
}
