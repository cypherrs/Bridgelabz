import java.util.*;
public class HighestValue {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("b",20);
        map.put("C",40);
        map.put("d",30);
        String keyhigh=null;
        int maxvalue=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxvalue){
                maxvalue=entry.getValue();
                keyhigh= entry.getKey();
            }
        }
        System.out.println("Highest Value: "+keyhigh);
    }
}
