package Searching;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){
        String str="programming";
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
