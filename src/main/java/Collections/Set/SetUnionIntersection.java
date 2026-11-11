package Collections.Set;
import java.util.*;
public class SetUnionIntersection {
    public static void main(String[] args){
        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer>set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer>union=new HashSet<>(set1);
        union.addAll(set2);//to combine all the elements from both the sets

        Set<Integer>intersection=new HashSet<>(set1);
        intersection.retainAll(set2);//to keep only common elements

        System.out.println("Union: "+union);
        System.out.println("Intersection: "+intersection);
    }
}
