package fc.java.course2.part2;

import fc.java.model2.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        Double[] doubles={1.0,2.0,3.0,4.0,5.0};

        AverageCalculator<Integer> integerAverageCalculator=new AverageCalculator<>(integers);
        double integerAverage= integerAverageCalculator.calculateAverage();
        System.out.println(integerAverage); // 3.0

        AverageCalculator<Double> doubleAverageCalculator=new AverageCalculator<>(doubles);
        double doubleAverage=doubleAverageCalculator.calculateAverage();
        System.out.println(doubleAverage); // 3.0
    }
}
