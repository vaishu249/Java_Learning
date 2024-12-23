import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter a element " + i + " ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}
