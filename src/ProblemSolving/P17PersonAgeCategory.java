package ProblemSolving;

import java.util.Scanner;

public class P17PersonAgeCategory {
    public static void main(String[] args) {
        System.out.println("Program For Categories Person in Different age group  ...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age =input.nextInt();
        if(age >=60){
            System.out.println("Senior");
        }
        else if(age<60 && age>=20){
            System.out.println("Adult");
        }
        else if(age<20 && age>=13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}
