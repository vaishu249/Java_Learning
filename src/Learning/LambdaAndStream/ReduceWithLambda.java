package Learning.LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceWithLambda {
    public static void main(String[] args) {
        List<Integer> no= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(no.stream().reduce(0,(a,b)->a+b));
    }
}
