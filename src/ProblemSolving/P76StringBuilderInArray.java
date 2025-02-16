package ProblemSolving;

import java.util.Scanner;

public class P76StringBuilderInArray {
    public static void main(String[] args) {
        String [] str=new String[5];
        createStringArray(str);
        display(str);
        stringBuilding(str);
    }
    public static void createStringArray(String str[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array Element : ");
        for(int i=0;i< str.length;i++){
            String n=input.next();
            str[i]=n;
        }
    }
    public static void display(String str[]){
        System.out.println("Your Array is :");
        for(String st:str){
            System.out.println(st);
        }
    }
    public static void stringBuilding(String str[]){
        StringBuilder st=new StringBuilder();
        for (String nStr:str){
            st.append(nStr+" ");
        }
        System.out.println("Your String is "+st.toString());
    }
}
