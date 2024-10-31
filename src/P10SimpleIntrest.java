import java.util.Scanner;

public class P10SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("Program For Calculate Simple Interest...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        int principle=input.nextInt();
        System.out.print("Enter the Rate : ");
        float rate =input.nextFloat();
        System.out.print("Enter the Time : ");
        float time =input.nextFloat();
        float interest=(principle*rate*time)/100;
        System.out.println("The Perimeter of Rectangle is : "+interest);
    }
}
