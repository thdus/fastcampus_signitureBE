package fc.java.part3;

public class NonstaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        NonstaticTest st=new NonstaticTest();
        int sum=st.hap(a,b);
        System.out.println("sum = " + sum);
    }
    public int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
