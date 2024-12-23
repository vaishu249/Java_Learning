import java.util.Scanner;

public class ArrayUtility {
    public static void inputFromUser(int[] arr) {
        Scanner input =new Scanner(System.in);
        int i=0;
        while(i<arr.length){
            System.out.print("Enter a element "+i+" ");
            arr[i]=input.nextInt();
            i++;
        }
    }
}
