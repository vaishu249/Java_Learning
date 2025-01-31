package ProblemSolving;

import java.util.List;

public class P49StringStreamUsingLambda {
    public static void main(String[] args) {
        List<String> name=List.of("XYZ","ABC","PQR","LMN","TUV");
        name.stream().forEach(data-> System.out.println(data));
    }
}
