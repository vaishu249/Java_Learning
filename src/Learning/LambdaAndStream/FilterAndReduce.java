package Learning.LambdaAndStream;

import java.util.List;
import java.util.function.Consumer;

public class FilterAndReduce {
    public static void main(String[] args) {
        List<String> list=List.of("Apple","Mango","Orange","Banana");

        //Normal method to access the element of list
        System.out.println("Printing element using normal for each..");
        for(String Fruit:list){
            System.out.println(Fruit);
        }

        // using a Stream
        System.out.println("Printing element using stream");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //using stream with lambda..
        System.out.println("Printing element using stream and lambda");
        list.stream().forEach(fruit-> System.out.println(fruit));
    }
}
