package ProblemSolving.P54FactorialWith2Ways;

public class FactorialTwoWay {
    public static void main(String[] args) {
        int fact=factorial(5);
        System.out.println(fact);


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
