package Collections.List;
import java.util.*;
public class RotateList {
    public static void rotateList(List<Integer>list,int k){
        int n=list.size();

        if(n==0){
            return;
        }
        k=k%n;

        List<Integer>temp=new ArrayList<>();

        for(int i=k;i<n;i++){
            temp.add(list.get(i));
        }
        for(int i=0;i<k;i++){
            temp.add(list.get(i));
        }
        list.clear();
        list.addAll(temp);
    }
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>(Arrays.asList(10,20,30,40,50));

        int k=2;
        rotateList(list,k);

        System.out.println("Rotated list: "+list);
    }
}
