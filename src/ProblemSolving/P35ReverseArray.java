package ProblemSolving;

public class P35ReverseArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputFromUser();
        System.out.println("Your original array is.. ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println("\nYour reverse array is.. ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static int[] reverse(int[] arr) {
        int i=0;
        while(i<arr.length/2){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            i++;
        }
        return arr;
    }
}
