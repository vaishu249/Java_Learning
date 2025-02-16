package ProblemSolving;

import java.util.Scanner;

public class P74FinalKeywordUse {
    public static void main(String[] args) {
        final  float PI=3.14f;
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        System.out.println("Area Of circle : "+area(r,PI));
    }
    public static float area(int r,float PI){
        float area;
        area=PI*r*r;
        return area;
    }
}
