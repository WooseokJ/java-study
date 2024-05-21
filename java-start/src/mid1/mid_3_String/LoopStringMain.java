package mid1.mid_3_String;

public class LoopStringMain {
    public static void main(String[] args) {


        // String
        long start = System.currentTimeMillis();
        String result = "";
        for(int i =0; i< 100000; i++) {
            result+="aasd";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); // 1118 (문자길면 더 오래걸려)



        // StringBuilder
        long start1 = System.currentTimeMillis();
        StringBuilder result1 = new StringBuilder();
        for(int i =0; i< 100000; i++) {
            result1.append("aasd");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1); // 2

    }
}
