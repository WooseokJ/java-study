package mid2.mid2_7_HashSet;

import java.util.Objects;

public class MemberOnlyHashCode {
    private String id;

    public MemberOnlyHashCode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MemberOnlyHashCode{" +
                "id='" + id + '\'' +
                '}';
    }
}
