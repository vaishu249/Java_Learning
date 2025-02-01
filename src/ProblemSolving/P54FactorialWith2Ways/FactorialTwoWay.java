package ProblemSolving.P54FactorialWith2Ways;

import java.util.stream.IntStream;

public class FactorialTwoWay {
    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println("Normal Programming..");
        System.out.println(fact);

        System.out.println("Functional programing...");
        int num=5;
        IntStream.rangeClosed(2,num).reduce((a,b)->a*b).ifPresent(System.out::println);
    }
    public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
