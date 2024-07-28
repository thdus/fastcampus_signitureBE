package fc.java.part2;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num =scanner.nextInt(); // 블럭상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요:");
        float f=scanner.nextFloat(); //블럭상태
        System.out.println("f = " + f);

        System.out.println("문자를 입력하세요:"); // "A", "ABC"
        String str=scanner.next();
        System.out.println("str = " + str);

        scanner.nextLine(); // 버퍼비우기(스트림 비우기)

        System.out.println("문자를 입력하세요:"); // "A", "ABC"
        String str1=scanner.nextLine();
        System.out.println("str1 = " + str1);
    }
}
