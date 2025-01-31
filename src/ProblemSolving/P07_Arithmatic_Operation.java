package ProblemSolving;

import java.util.Scanner;
// Program for Arithmatic operation
public class P07_Arithmatic_Operation {
    public static void main(String[] args) {
        System.out.println("Program For Arithmatic Operation +,-,*,/,%");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int num1=input.nextInt();
        System.out.print("Enter 2nd Number :");
        int num2=input.nextInt();
        System.out.println("Addition of numbers       : "+(num1+num2));
        System.out.println("Substraction of numbers   : "+(num1-num2));
        System.out.println("Multiplication of numbers : "+(num1*num2));
        System.out.println("Division of numbers       : "+(num1/num2));
        System.out.println("Remender after Division   : "+(num1%num2));

        //output:
        //Program For Arithmatic Operation +,-,*,/,%
        //Enter 1st Number :20
        //Enter 2nd Number :5
        //Addition of numbers       : 25
        //Substraction of numbers   : 15
        //Multiplication of numbers : 100
        //Division of numbers       : 4
        //Remender after Division   : 0


    }
}
