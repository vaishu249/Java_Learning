package ProblemSolving;

import java.util.Scanner;

public class P71CircumferenceOfCircleUsingPow {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Diameter of circle :");
        int radius=input.nextInt();
        float circumfrence= (float) (2*radius*Math.PI);
        System.out.println("Circumference of circle : "+circumfrence);
    }
}
