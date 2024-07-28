package fc.java.part3;

import fc.java.model.Allstatic;

public class AllStaticTest {
    public static void main(String[] args) {
//        Allstatic st = new Allstatic();
//        System.out.println(st.hap(10,20)); // 30
//        System.out.println(st.max(10,20)); // 20
//        System.out.println(st.min(10,20)); // 10
        System.out.println(Allstatic.hap(10,20));
        System.out.println(Allstatic.max(10,20));
        System.out.println(Allstatic.min(10,20));

        //System sys=new System(); // private
        //System.
        //Math m=new Math(); // private
        System.out.println(Math.max(30,60)); // 60
        System.out.println(Math.min(40,10)); // 10
    }
}
