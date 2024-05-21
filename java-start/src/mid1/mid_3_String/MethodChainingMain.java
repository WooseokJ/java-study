package mid1.mid_3_String;

public class MethodChainingMain {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);
        int val = adder.getVal();
        System.out.println(val); // 6


        ValueAdder adder1 = new ValueAdder();
        ValueAdder a1 = adder1.add(1);
        ValueAdder a2 = a1.add(2);
        ValueAdder a3 = a2.add(3);
        int result = a3.getVal();
        System.out.println(a1); // ValueAdder@30f39991
        System.out.println(a2);// ValueAdder@30f39991
        System.out.println(a3);// ValueAdder@30f39991
        System.out.println(result); // 6


        adder1.add(1).add(2).add(3).getVal(); // result와 동일
    }
}
