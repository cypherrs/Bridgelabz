import java.util.*;

public class RotateList {
    public static void rotatelist(List<Integer> list,int position){
        Collections.rotate(list,position);
    }
    public static void main(String[] args){
        List<Integer> inputlist= new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        int positiontorotate = 3;
        System.out.println(inputlist);
        rotatelist(inputlist,positiontorotate);
        System.out.println("List after rotation by"+positiontorotate+" positions: "+inputlist);

    }
}
