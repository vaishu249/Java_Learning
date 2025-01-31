package ProblemSolving;

public class P27MaximumMinimunNoOfArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputFromUser();
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }
    public static int maximum(int[] arr){
        int i=0;
        int max=arr[i];
        while(i< arr.length){
            if(max<=arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] arr){
        int i=0;
        int min=arr[i];
        while(i< arr.length){
            if(min>=arr[i]){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
