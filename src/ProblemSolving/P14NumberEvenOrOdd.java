package ProblemSolving;

import java.util.Scanner;

public class P14NumberEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Program For Identify No is Even or Odd...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=input.nextInt();
        if(num==0){
            System.out.println("Sorry cant divide ...");
        }
        else if(num%2==0){
            System.out.println(num+" is Even..");
        }
        else{
            System.out.println(num+" is Odd..");
        }
    }
}
