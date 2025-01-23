package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListOfQueue {
    public static void main(String[] args) {
        Queue<String> str=new LinkedList<>();
        str.add("Vaishnavi");
        str.add("Sneha");
        str.add("Saksham");
        str.offer("Kunal");
        str.offer("Vaishali");
        str.offer("Ameuta");
        str.remove();
        str.poll();
        str.element();
        for(String i:str){
            System.out.println(i);
        }
    }
}
