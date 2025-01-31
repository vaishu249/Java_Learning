package Learning.LambdaAndStream;

import java.util.List;

public class FilterWithLambda {
    public static void main(String[] args) {
        List<String> StudentName=List.of("Vaishnavi","Sneha","Kunal","Vaishali","Amruta","Gayatri","Anita");
        StudentName.stream().filter(std->std.startsWith("V")).forEach(name-> System.out.println(name));
    }
}
