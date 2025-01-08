import java.util.Scanner;

public class P32SumAndAverageOf2DArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter row size :");
        int row=input.nextInt();
        System.out.print("Enter column size :");
        int col=input.nextInt();
        int[] [] numArr=new int[row] [col];
        System.out.println("Enter element ...");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int num= input.nextInt();
                numArr[i][j]=num;
            }
        }
        System.out.println("Your array is ...");
        int sum=0;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(numArr[i][j]+" ");
                sum+=numArr[i][j];
                count++;

            }
            System.out.println();
        }
        System.out.println("Sum of array is : "+sum);
        System.out.println("Average of array is : "+((double) sum/count));
        System.out.println("count="+count);
    }
}
