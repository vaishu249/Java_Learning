package Learning.Collection;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> l=new java.util.ArrayList<>();
        l.add(10);
        l.add(0,20);
        l.set(1,24);
        l.add(40);
        l.add(30);
        l.add(60);
        l.add(80);
        System.out.println("List Element : ");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("Element contain or not : "+l.contains(60));
        System.out.println("Size of list : "+l.size());
        l.clear();
        System.out.println("After delete all element the size of list : "+l.size());
    }
}
