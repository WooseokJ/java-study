package mid2.mid2_7_HashSet;

public class MemberNoHashNoEquals {
    private String id;

    public String getId() {
        return id;
    }

    public MemberNoHashNoEquals(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEquals{" +
                "id='" + id + '\'' +
                '}';
    }
}
