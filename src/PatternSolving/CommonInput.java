package PatternSolving;

import java.util.Scanner;

public class CommonInput {
    public static void takeInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
    }
}
