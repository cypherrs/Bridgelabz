import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeduplicate(List<Integer> inputlist){
        Set<Integer> set= new LinkedHashSet<>(inputlist);
        return new ArrayList<>(set);
    }
    public static void main(String[] args){
        List<Integer> inputlist=Arrays.asList(2,3,4,5,3,5,2,1,5);
        List<Integer> outputlist=removeduplicate(inputlist);
        System.out.println(inputlist);
        System.out.println(outputlist);
    }
}
