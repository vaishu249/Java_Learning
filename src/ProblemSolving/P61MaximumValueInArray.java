package ProblemSolving;

import java.util.Scanner;

public class P61MaximumValueInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter size of array..");
        int size= input.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            int n= input.nextInt();
            arr[i]=n;
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Maximum value in array is : ");
        int maximumVal=0;
        for (int i = 0; i < arr.length; i++) {
            if(maximumVal<arr[i]){
                maximumVal=arr[i];
            }
        }
        System.out.println(maximumVal);
    }
}
