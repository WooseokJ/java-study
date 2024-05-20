package mid2.mid2_6_hash.Set;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inutArr = new Integer[4];
        inutArr[0] =1;
        inutArr[1] =2;
        inutArr[2] =5;
        inutArr[3] =8;
        int target = 8;

        // O(n)
        for (Integer i : inutArr) {
            if(i == target) {
                System.out.println(i + " 찾음");
            }
        }
    }
}
