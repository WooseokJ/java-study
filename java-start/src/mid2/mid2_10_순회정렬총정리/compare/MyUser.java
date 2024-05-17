package mid2.mid2_10_순회정렬총정리.compare;

// MyUser는 비교할수있는 객체야
public class MyUser implements Comparable<MyUser> {
    private String id;
    private int age;


    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " VS " + o);
        // 여기선 정렬기준을 나이로 정해 오름차순
        return this.age < o.age ? -1: (this.age == o.age ? 0 :1);
//        return this.age < o.age ? -1: (this.age == o.age ? 0 :1) * -1; // 내림차순.
    }


    // get-set, 생성자, toString
    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

}
