package ProblemSolving;

import java.util.Scanner;

public class P33MergeTwoSortedArray {
    public int[] sorted(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public int[] inputFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter a element " + (i+1) + " ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public void merge(int[] arr,int[] arr2,int[] result){
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
        for(int i= arr2.length;i<result.length;i++){
            result[i]=arr2[i];
        }
    }
    public static void main(String[] args) {
        P33MergeTwoSortedArray obj=new P33MergeTwoSortedArray();
        int[] arr=obj.inputFromUser();
        int[] arr2=obj.inputFromUser();
        int[] result=new int[arr.length+arr2.length];
        obj.sorted(arr2);
        obj.sorted(arr);
        obj.merge(arr,arr2,result);
    }

}
