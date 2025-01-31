package ProblemSolving;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Program for Swap 2 no ...");
        System.out.print("Enter No for a :");
        int a=input.nextInt();
        System.out.print("Enter No for b :");
        int b=input.nextInt();
        System.out.println("Number Before Swap a="+a+" b="+b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("Number After Swap a="+a+" b="+b);
        System.out.println();

    }
}
