//00000000010
//000000009
//00000008
//0000007
//000006
//00005
//0004
//003
//02
//1
package PatternSolving;

import java.util.Scanner;

public class Pattern_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                System.out.print("0");
            }
            System.out.print((row-i)+"\n");
        }
    }
}
