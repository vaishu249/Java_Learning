package ProblemSolving;

import java.util.Scanner;

public class P09AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Program For Calculate Area Of Triangle...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int base=input.nextInt();
        System.out.print("Enter the Height : ");
        int height =input.nextInt();
        double result =0.5*base*height;
        System.out.println("The Perimeter of Rectangle is : "+result);
    }
}
