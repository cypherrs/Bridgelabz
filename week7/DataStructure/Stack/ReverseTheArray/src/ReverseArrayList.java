import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        for(int i=0, j= list.size() - 1; i < j; i++ , j--){
//            Integer temp =list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
//        }
        Collections.reverse(list);
        System.out.println(list);

    }
}