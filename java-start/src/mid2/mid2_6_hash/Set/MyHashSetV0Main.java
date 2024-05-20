package mid2.mid2_6_hash.Set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); // O(1)
        set.add(2); // O(n)
        set.add(3);// O(n)
        set.add(4);// O(n)
        set.add(5);// O(n)
        System.out.println(set); // MyHashSetV0{elementData=[1, 2, 3, 4, 5, 0, 0, 0, 0, 0], size=5}

        set.add(4); // 중복데이터 저장.(set 변화x)
        System.out.println(set); // MyHashSetV0{elementData=[1, 2, 3, 4, 5, 0, 0, 0, 0, 0], size=5}

        System.out.println(set.contains(2)); // true
        System.out.println(set.contains(100)); // false

    }
}
