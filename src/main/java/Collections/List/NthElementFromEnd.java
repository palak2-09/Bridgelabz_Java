package Collections.List;
import java.util.*;
public class NthElementFromEnd {
    public static String findNthFromEnd(LinkedList<String>list, int n){
        if(n<=0||list.isEmpty()){
            return null;
        }
        Iterator<String>fast=list.iterator();
        Iterator<String>slow=list.iterator();

        for(int i=0;i<n;i++){
            if(!fast.hasNext()){
                return null;
            }
            fast.next();
        }
        String result=null;

        while(fast.hasNext()){
            result=slow.next();
            fast.next();
        }
        return slow.hasNext() ? slow.next() : result;
    }
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E")
        );

        int n = 2;

        String result = findNthFromEnd(list, n);

        System.out.println("Nth element from end: " + result);
    }

}

