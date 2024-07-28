package fc.java.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase=(s)->s.toUpperCase();
        StringOperation toLowerCase=(s)->s.toLowerCase();

        String input="Lambda Expression";
        System.out.println(processString(input, toUpperCase)); // LAMBDA EXPRESSION
        System.out.println(processString(input, toLowerCase)); // lambda expression

    }
    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
