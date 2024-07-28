package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArg {
    private static Object obj;

    public static void main(String[] args) {
        A a=new A();
        display(a);
        B b = new B();
        display(b);
    }
    private static void display(Object obj){ // 다형성인수 활용
        if(obj instanceof A) {
            ((A) obj).printGo();
        }else{
            ((B)obj).printGo();
        }
    }
}
