package ProblemSolving;

import java.util.Scanner;

public class P66FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a element");
        int n=input.nextInt();
        System.out.println(fact(n));
    }
    public static int fact(int num){
        if(num==0){
            return 0;
        } else if (num==1) {
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
}
