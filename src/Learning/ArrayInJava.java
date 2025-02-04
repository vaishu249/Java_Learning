package Learning;

import java.util.*;

public class ArrayInJava {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row= input.nextInt();
        int col= input.nextInt();
        int [] [] arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int n= input.nextInt();
                arr[i][j]=n;
            }
        }
        int sum=0;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
