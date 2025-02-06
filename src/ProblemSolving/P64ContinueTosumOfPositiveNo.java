package ProblemSolving;

public class P64ContinueTosumOfPositiveNo {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 6 ; i++) {
            if(i%2!=0){
                continue;
            }
            sum+=i;
        }
        System.out.println("Sum of positive : "+sum);
    }
}
