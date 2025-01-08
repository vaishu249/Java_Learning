import java.util.Scanner;

public class P29DeleteOneEleAndAddInNew {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputFromUser();
        int[] newArr=new int[arr.length-1];

    }

    public static void addEleInArray(int[] arr,int[] newArr) {
        Scanner input= new Scanner(System.in) ;
        int ele= input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                continue;
            }

        }
    }
}
