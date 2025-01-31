package ProblemSolving;

import java.util.Scanner;

public class P37MinimumOfTwoNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 element : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int greater=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("greater no : "+greater);

    }
}
