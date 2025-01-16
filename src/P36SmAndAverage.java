import java.util.Scanner;

public class P36SmAndAverage {
    public static void main(String[] args) {
        int row=2;
        int col=2;
        Scanner input=new Scanner(System.in);
        int sum=0;
        int [][] arr= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               arr[i][j]=input.nextInt();
               sum+=arr[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("sum: "+sum);
        double avg=sum/(row+col);
        System.out.println("avg : "+avg);

    }
}
