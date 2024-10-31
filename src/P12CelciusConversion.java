import java.util.Scanner;

public class P12CelciusConversion {
    public static void main(String[] args) {
        System.out.println("Program For fahrenheit to celsius conversion...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the fahrenheit : ");
        float fahrenheit=input.nextInt();
        float celsius=(fahrenheit-32)*5/9;
        System.out.println("Celsius is : "+celsius);
    }
}
