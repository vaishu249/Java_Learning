package Learning.Collection;
import java.util.HashSet;
import java.util.Set;
public class SetHashSet {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();
        stringSet.add("vaishnavi");
        stringSet.add("sneha");
        stringSet.add("kunal");
        stringSet.add("Amruta");
        stringSet.add("vaishali");
        stringSet.add("a");
        stringSet.remove("vaishnavi");
        for(String str:stringSet){
            System.out.println(str);
        }
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("kunal"));
    }
}
