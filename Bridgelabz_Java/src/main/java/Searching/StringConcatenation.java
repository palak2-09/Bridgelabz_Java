package Searching;

public class StringConcatenation {
    public static void main(String[] args){
        String[] arr={"Hello"," ","World","!"};

        StringBuffer sb= new StringBuffer();

        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        String result=sb.toString();
        System.out.println(result);
    }
}
