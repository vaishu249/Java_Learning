package ProblemSolving;

import java.util.Scanner;

public class P24ArraySearchAnElement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8};
        int n=input.nextInt();
        if(num(arr,n)){
            System.out.println("Number is found ");
        }
        else{
            System.out.println("Number is not found");
        }
    }
    public static boolean num(int[] arr,int n){
        int i=0;
        while( i<arr.length){
            if(arr[i]==n){
                return true;
            }
            i++;
        }
        return false;
    }
}
