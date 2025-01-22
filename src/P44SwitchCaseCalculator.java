import java.util.Scanner;

public class P44SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a and b value:");
        int a=input.nextInt();
        int b= input.nextInt();
        System.out.println("1.Addition\n2.Substraction\n3.Division\n4.Multiplication\n5.Modulus");
        int n= input.nextInt();
        float ans=switch(n){
            case 1->(a+b);
            case 2->(a-b);
            case 3->(a/b);
            case 4->(a*b);
            case 5->(a%b);
            default -> 0;
        };
        System.out.println(ans==0?"You enter wrong choice":("The result is :"+ans));
    }
}
