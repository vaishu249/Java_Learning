package ProblemSolving;

import java.util.Scanner;

public class P11CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Program For Calculate Compound Interest...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        int principle=input.nextInt();
        System.out.print("Enter the Rate : ");
        float rate =input.nextFloat();
        System.out.print("Enter the Time : ");
        float time =input.nextFloat();
        double interest=principle*Math.pow((1+rate/100),time);
        System.out.println("The Perimeter of Rectangle is : "+interest);
    }
}
