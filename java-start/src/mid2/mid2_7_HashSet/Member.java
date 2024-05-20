package mid2.mid2_7_HashSet;

import java.util.Objects;

public class Member {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) { // 여기선 Member 의 id기준으로 비교
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() { // id 기준으로 hashCode 생성.
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                '}';
    }
}
