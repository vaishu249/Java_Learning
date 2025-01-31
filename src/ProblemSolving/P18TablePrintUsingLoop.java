package ProblemSolving;

import java.util.Scanner;

public class P18TablePrintUsingLoop {
    public static void main(String[] args) {
        System.out.println("Program For Print Table...\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no which you want to print table : ");
        int num= input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
    }
}
