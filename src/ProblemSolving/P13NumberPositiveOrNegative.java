package ProblemSolving;

import java.util.Scanner;

public class P13NumberPositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Program For Identify No is positive,Negative or Equal to zero...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=input.nextInt();
        if(num>0){
            System.out.println(num+" is Positive");
        }
        else if(num<0){
            System.out.println(num+" is Negative");
        }
        else{
            System.out.println(num+" is equal to zero");
        }
    }
}
