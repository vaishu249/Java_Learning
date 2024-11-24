import java.util.Scanner;

public class P23FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Program of reverse number .....");
        int num=gettingNum();
        System.out.println("Reverse of num  ");
        FibonacciSeries(num);

    }
    public static int gettingNum(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter A number How many term you want  : ");
        return input.nextInt();
    }
    public static void FibonacciSeries(int n){
        int n1=0;
        int n2=1;
        int i=0;
        int n3=0;
        if(n==0){
            System.out.println("Enter valid no..");
        }
        else if(n==1){
            System.out.println(n1);
        }
        else {
            while (i<n) {
                System.out.println(n1);
                n3 = n1 + n2;
                n1 = n2;
                n2=n3;
                i++;
            }
        }
    }
}
