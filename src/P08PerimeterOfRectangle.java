import java.util.Scanner;

public class P08PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Program For Calculate Perimeter of Reactangle...");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int length=input.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth=input.nextInt();
        System.out.println("The Perimeter of Rectangle is : "+(2*(length+breadth)));
    }
}
