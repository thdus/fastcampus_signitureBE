package fc.java.part2;

import fc.java.model2.MathOperation;

public class FuctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo=new FuctionInterfaceTest();
        int result = mo.operation(10,20);
        System.out.println("result = " + result); // 30
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
