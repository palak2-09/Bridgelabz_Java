package Collections.Map;
import java.util.*;
public class WordFrequency {
    public static void main(String[] args){
        String str="Hello world, hello Java!";
        str=str.toLowerCase();
        str=str.replaceAll("[^a-z0-9 ]","");
        String[] words=str.split(" ");
        HashMap<String,Integer>map=new HashMap<>();

        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);

        }
        System.out.println(map);
    }
}
