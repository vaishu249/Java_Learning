import java.util.Scanner;

public class P43SwitchCaseMonths {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the month ");
        int month= input.nextInt();
        String output=switch(month){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default -> "You Enter wrong choice";
        };
        System.out.println("The month is : "+output);
    }
}
