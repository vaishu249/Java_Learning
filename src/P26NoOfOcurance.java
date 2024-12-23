import java.util.Scanner;

public class P26NoOfOcurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=ArrayUtility.inputFromUser();
        System.out.print("Enter Element you want to count : ");
        int number=input.nextInt();
        if(ocurance(arr,number)>0){
            System.out.println("Number of "+number+" ocurance is : "+ocurance(arr,number));
        }
        else{
            System.out.println("Sorry.... Number is not present in array");
        }

    }
    public static int ocurance(int[] arr,int num){
        int i=0;
        int count=0;
        while(i< arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }
}
