package ProblemSolving;

import java.util.List;

public class P52StringConcatInLambda {
    public static void main(String[] args) {
        List<String> concat=List.of("I","Am","Good","Girl","AS","The");
        String result=concat.stream().filter(s->s.length()>2).reduce("",(a,b)-> a + " " + b);
        System.out.println(result);
    }
}
//output: Good Girl The
