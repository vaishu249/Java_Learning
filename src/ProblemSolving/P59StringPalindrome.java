package ProblemSolving;

import java.util.Scanner;

public class P59StringPalindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str=input.next();
        String temp = "";
        int i=0;
        while(i<str.length()){
            temp+=str.charAt(str.length()-1-i);
            i++;
        }
        if(str.equals(temp)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Niklo");
        }
    }
}
