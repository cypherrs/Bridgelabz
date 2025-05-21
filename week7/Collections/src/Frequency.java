import java.util.*;

public class Frequency {
    public static Map<String, Integer> countfrequency(List<String> list ){
        Map<String,Integer> frequencymap=new HashMap<>();
        for(String item:list){
            if(frequencymap.containsKey(item)){
                frequencymap.put(item, frequencymap.get(item)+1);
            }
            else{
                frequencymap.put(item,1);
            }
        }
        return frequencymap;

    }
    public static void main(String[] args){
        List<String> inputlist=Arrays.asList("Apple","bananna","Apple","cat");
        Map<String,Integer> freqencies = countfrequency(inputlist);
        System.out.println(freqencies);
    }
}
