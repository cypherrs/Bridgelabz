import java.util.*;
public class SortedList {
    public static void main(String[] args){
        Set<Integer> hashmap=new HashSet<>(Arrays.asList(5,2,4,7,1,3));
        List<Integer> sorted=new ArrayList<>(hashmap);
        Collections.sort(sorted);
        System.out.println("Sorted List: "+sorted);
    }
}
