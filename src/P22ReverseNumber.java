import java.util.Scanner;

public class P22ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Program of reverse number .....");
        System.out.println("Reverse of num  "+sumOfDigit(gettingNum()));
    }
    public static int gettingNum(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter A number : ");
        return input.nextInt();
    }
    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
}
