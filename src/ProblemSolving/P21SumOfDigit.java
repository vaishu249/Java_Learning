package ProblemSolving;

import java.util.Scanner;

public class P21SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Sum Of Digit "+sumOfDigit(gettingNum()));
    }
    public static int gettingNum(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter A number : ");
        return input.nextInt();
    }
    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}
