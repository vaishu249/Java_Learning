package ProblemSolving;

import java.util.function.BinaryOperator;

public class P48TwoNoMultiplicationUsingLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul=(a,b)->a*b;
        System.out.println(mul.apply(10,20));
    }
}
