import java.util.Scanner;

public class P42EvenOddTerneryOpr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a element you want to check even or odd : ");
        int n=input.nextInt();
        String checkEvenOdd=n%2==0?"Even":"Odd";
        System.out.printf("The no %d is %s",n,checkEvenOdd);
    }
}
