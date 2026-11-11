package Collections.List;
import java.util.*;
public class ReverseList {
    public static void reverseList(List<Integer>list){
        int start=0;
        int end=list.size()-1;

        while(start<end){
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        List<Integer>arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer>linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(arrayList);
        reverseList(linkedList);

        System.out.println("ArrayList: "+arrayList);
        System.out.println("LinkedList: "+linkedList);
    }
}
