//1
//1 3
//1 3 5
//1 3 5 7
//1 3 5 7 9
//2 4 6 8 10
//2 4 6 8
//2 4 6
//2 4
//2
package PatternSolving;
import java.util.Scanner;

public class Pattern_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int row= input.nextInt();
        System.out.println("Enter No of Columns : ");
        int col= input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((j*2-1)+" ");
            }
            System.out.println();
        }
        for(int i=row;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print((j*2)+" ");
            }
            System.out.println();
        }
    }
}
