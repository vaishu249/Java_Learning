package ProblemSolving;

import java.util.Scanner;

public class P50TernaryOperatorStudentScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Score : ");
        float score= input.nextFloat();
        String scoreCategory= (score>=80) ? "High" : (score>=60 ? "Moderate" : "Low");
        System.out.println("Your Score is \""+scoreCategory+"\"");
    }
}
