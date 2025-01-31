package ProblemSolving;

import java.util.Scanner;

public class P15GreatestAmongThreeNo {
    public static void main(String[] args) {
        System.out.println("Program For finding largest no among 3 no ...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Num1 : ");
        int num1=input.nextInt();
        System.out.print("Enter the Num2 : ");
        int num2=input.nextInt();
        System.out.print("Enter the Num1 : ");
        int num3=input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" : num1 is greater");
        }
        else if(num2>num3 && num2>num1){
            System.out.println(num2+" : num2 is greater");
        }
        else{
            System.out.println(num3+" : num3 is greater");
        }
    }
}
