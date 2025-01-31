package ProblemSolving;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        //Addition of two no with taking input feom user
        //Enter Your Name : Vaishnavi
        //Hello Vaishnavi
        //Enter a No 1: 20
        //Enter a No 2: 30
        //Result of 2 no addition : 50
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name=input.nextLine();
        System.out.print("Hello "+name);
        System.out.print("\nEnter a No 1: ");
        int num1=input.nextInt();
        System.out.print("Enter a No 2: ");
        int num2=input.nextInt();
        int result=num1+num2;
        System.out.println("Result of 2 no addition : "+result);
    }
}
