package ProblemSolving;

import java.util.Scanner;

public class P62OccuranceOfNoInArray {
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
        System.out.println("\nEnter element you want to check ocurance:");
        int num= input.nextInt();
        int count=0;
        for(int n:arr){
            if(n==num){
                count++;
            }
        }
        System.out.println(num+" This no is comes in array "+count+" Times");
    }
}
