package ProblemSolving;

import java.util.Scanner;

public class P20Factorial {
    public static void main(String[] args) {
        System.out.println("Program For factorial of num..\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no where we have to print factorial number  : ");
        int num =input.nextInt();
        int sum=1;
        int i=1;
        while(i<=num){
            sum*=i;
            i++;
        }
        System.out.println("Factorial of "+num+" is "+sum);
    }
}
