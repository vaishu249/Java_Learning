package ProblemSolving;

import java.util.Scanner;

public class P60NoPrimeOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= input.nextInt();
        int i=2;
        boolean flag=false;
        while(i<num){
            if(num%i==0){
                flag=true;
            }
            i++;
        }
        if(flag){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is  prime");
        }
    }
}
