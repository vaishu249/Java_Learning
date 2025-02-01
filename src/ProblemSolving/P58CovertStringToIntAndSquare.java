package ProblemSolving;

import java.util.List;

public class P58CovertStringToIntAndSquare {
    public static void main(String[] args) {
        List<String> numbers=List.of("1","2","3","4","5");
        numbers.stream().map(Integer::parseInt).map(a->Math.pow(a,2)).reduce((a,b)->a+b).ifPresent(System.out::println);
    }
}
