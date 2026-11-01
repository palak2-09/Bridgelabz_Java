package Searching;

public class LinearSearch2 {
    public static String searchSentence(String[] sentences, String word){
        for(int i=0;i<sentences.length;i++){
            if(sentences[i].contains(word)){
                return sentences[i];
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {

        String[] sentences = {
                "I love Java programming",
                "Python is easy to learn",
                "Java is an object oriented language",
                "I am learning data structures"
        };

        String word = "Java";

        String result = searchSentence(sentences, word);

        System.out.println(result);
    }
}
