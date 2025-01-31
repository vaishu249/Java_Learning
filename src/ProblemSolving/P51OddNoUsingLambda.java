package ProblemSolving;

import java.util.Arrays;
import java.util.List;

public class P51OddNoUsingLambda {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,2,3,4,5,6,7,8);
        value.stream().filter(v->v%2!=0).forEach(v-> System.out.println("Odd - "+v));
    }
}
