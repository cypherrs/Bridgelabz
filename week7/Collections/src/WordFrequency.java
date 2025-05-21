import java.util.*;
public class WordFrequency {
    public static Map<String,Integer> countword(String text){
        Map<String,Integer> wordcount=new HashMap<>();
        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = cleanedText.split("\\s+");

        for (String word : words) {
            wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
        }
        return wordcount;
    }
    public static void main(String[] args){
        String text="Hello world java, hello java";
        Map<String,Integer> frequency=countword(text);
        System.out.println(frequency);
    }
}