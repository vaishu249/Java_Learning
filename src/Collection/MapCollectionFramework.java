package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionFramework {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Vaishnavi");
        m.put(2,"Sneha");
        m.put(3,"abc");
        m.put(3,"Vaishnavi");
        m.put(5,"Sneha");
        m.put(6,"abc");
        for(int n:m.keySet()){
            System.out.printf("%d : %s \n",n,m.get(n));
        }
        System.out.println(m.remove(5));
        System.out.println(m.size());
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey(4));

    }
}
