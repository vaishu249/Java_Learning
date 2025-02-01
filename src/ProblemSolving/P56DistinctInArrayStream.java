package ProblemSolving;

import java.util.List;
import java.util.stream.Collectors;

public class P56DistinctInArrayStream {
    public static void main(String[] args) {
        List<Integer> marks=List.of(10,1,1,10,2,4,5,4,5,6,78,8);
        List<Integer> newMarks=marks.stream().distinct().collect(Collectors.toList());
        System.out.println("Old list : "+marks);
        System.out.println("New List : "+newMarks);
    }
}
