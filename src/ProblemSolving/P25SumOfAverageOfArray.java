package ProblemSolving;

import java.util.Scanner;

public class P25SumOfAverageOfArray {
    public static void main(String[] args) {
        int[] arr=new int[5];
        inputFromUser(arr);
        printingArrayElement(arr);
        System.out.println("\nSum of an array: "+sumOfAvg(arr));
        System.out.println("Average is : "+sumOfAvg(arr)/arr.length);
    }

    public static void inputFromUser(int[] arr) {
        Scanner input =new Scanner(System.in);
        int i=0;
        while(i<arr.length){
            System.out.print("Enter a element ");
            arr[i]=input.nextInt();
            i++;
        }
    }
    public static void printingArrayElement(int[] arr){
        int i=0;
        System.out.println("Your Array Elements are : ");
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static int sumOfAvg(int[] arr){
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }
}
