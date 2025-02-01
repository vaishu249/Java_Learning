package Learning.LambdaAndStream;

import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {
        List<String> name=List.of("vaishnavi","Kunal","Vaishali","Sneha","Amruta");
        //Normal way
        name.stream().forEach(n-> System.out.println(n));

        //using method refrences
        name.stream().forEach(System.out::println);
    }
}
