package fc.java.part2;
// 인터페이스를 구현한 구현체를 외부에 만들어 놓고 사용하는 방법
import fc.java.model2.MathOperation;
import fc.java.model2.MathOperationImpl;

public class FuntionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo=new MathOperationImpl();
        int result=mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
