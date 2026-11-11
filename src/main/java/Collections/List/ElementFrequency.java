package Collections.List;
import java.util.*;
public class ElementFrequency {
    public static Map<String,Integer>findFrequency(List<String>list){
        Map<String,Integer>map=new HashMap<>();
        for(String str:list){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        return map;
    }
    public static void main(String[] args){
        List<String>list=Arrays.asList("apple","banana","apple","orange");
        Map<String,Integer>result=findFrequency(list);
        System.out.println(result);
    }
}
