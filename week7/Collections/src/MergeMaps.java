import java.util.*;
public class MergeMaps {
    public static void main(String[] args){
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("b",4);
        map2.put("c",5);
        map2.put("d",6);
        for(Map.Entry<String,Integer> entry: map2.entrySet()){
             map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        System.out.println("Merged Map: "+map1);
    }
}
