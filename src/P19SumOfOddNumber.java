import java.util.Scanner;

public class P19SumOfOddNumber {
    public static void main(String[] args) {
        System.out.println("Program For Print sum of odd numbers...\n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the no where we have to print odd number addition : ");
        int num=input.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Addition of odd number from 1 to "+num+" i: "+sum);
    }
}
