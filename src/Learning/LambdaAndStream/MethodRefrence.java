package Learning.LambdaAndStream;

import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {
        List<String> name=List.of("vaishnavi","Kunal","Vaishali","Sneha","Amruta");
        //Normal way
        System.out.println("Normal way ..");
        name.stream().forEach(n-> System.out.println(n));

        //using method refrences
        System.out.println("Refrence Method");
        name.stream().forEach(System.out::println);

        List<Integer> marks=List.of(90,87,56,45);

        System.out.println("Normal way ..");

        int final_Marks=marks.stream().reduce(0,(a,b)->a+b);
        System.out.println(final_Marks);

        System.out.println("Refrence Method");

        int marks2=marks.stream().reduce(0,Integer::sum);
        System.out.println(marks2);
    }
}
