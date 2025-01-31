package ProblemSolving;

import java.util.Scanner;

public class P41ExceptionHandling {
    public static void main(String[] args) {
        divideZero();
    }
    public static void divideZero(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a= input.nextInt();
        System.out.println("Enter a Second Number: ");
        int b= input.nextInt();
        try{
            float result=a/b;
            System.out.printf("The division of %d and %d is %f..",a,b,result);
        }catch (ArithmeticException exp){
            System.out.println("The no can not divide by zero...\nYou want to divide another no press 1 or else 0");
            int choice=input.nextInt();
            if(choice==1){
                divideZero();
            }
        }finally {
            System.out.println("\nThe execution is done successfully...");
        }
    }
}
