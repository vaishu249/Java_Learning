package ProblemSolving;

import java.util.Scanner;

public class P73NoGuessingUsingMath {
    public static void main(String[] args) {
        int a=(int)(Math.random()*0)+6;
        System.out.println(a);
        Scanner input=new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter the guess no : ");
            x= input.nextInt();
            if(x>a){
                System.out.println("Enter Shorter no...");
            } else if (x<a) {
                System.out.println("Enter Greater no...");
            } else if (x<0) {
                System.out.println("enter positive no ...");
            } else{
                System.out.println("Great you Enter correct no...");
            }
        }while(a!=x);
    }
}
