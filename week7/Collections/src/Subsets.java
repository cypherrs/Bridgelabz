import java.util.*;
public class Subsets {
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,5,6));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,4,2,4,6,7,5));
        boolean isequal=set2.containsAll(set1);
        System.out.println("Is it Subset?: "+isequal);
    }
}
