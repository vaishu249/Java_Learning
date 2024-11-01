import java.util.Scanner;

public class P16GradeFinding {
    public static void main(String[] args) {
        System.out.println("Program For Grade for your enter marks ...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks=input.nextInt();
        if(marks>=90){
            System.out.println("A grade");
        }
        else if(marks>=75){
            System.out.println("B grade");
        }
        else if(marks>=60){
            System.out.println("C grade");
        }
        else if(marks>=30){
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }
    }
}
