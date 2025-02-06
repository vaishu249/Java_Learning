package ProblemSolving;

import java.util.Scanner;

public class P63SpecificWordOccurThenBreakLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("Enter a word: ");
            name = input.nextLine();
        } while (!name.equalsIgnoreCase("exit"));
        System.out.println("Yes...You guess correct choice..");
    }
}
