import java.util.*;
public class InvertMap {
    public static Map<Integer, List<String>> invertmap(Map<String, Integer> original){
        Map<Integer,List<String>> invertedmap=new HashMap<>();
        for(Map.Entry<String, Integer> entry: original.entrySet()){
            invertedmap
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }
        return invertedmap;
    }
    public static void main(String[] args){
        Map<String, Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",2);
        map.put("D",1);
        Map<Integer,List<String>> invertedmap=invertmap(map);
        System.out.println(invertedmap);
    }

}
