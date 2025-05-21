import java.util.*;
public class TwoSetsEqual {
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(6);
        set1.add(5);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(5);
        boolean isequal= set1.equals(set2);
        System.out.println("Is both Sets Are Equal: "+isequal);
    }
}