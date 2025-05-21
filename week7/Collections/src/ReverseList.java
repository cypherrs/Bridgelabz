import java.util.ArrayList;
import java.util.LinkedList;


public class ReverseList {
    public static <T> ArrayList<T> reversearray(ArrayList<T> list){
        ArrayList<T> reversedlist=new ArrayList<>();

        for(int i=list.size()-1;i>=0;i--){
            reversedlist.add(list.get(i));
        }
        return reversedlist;
    }

    public static <T> LinkedList<T> reverselist(LinkedList<T> list){
        LinkedList<T> reversedlist=new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            reversedlist.add( list.get(i));
        }
        return reversedlist;
    }

    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        ArrayList<Integer> reversearray=reversearray(array);
        System.out.println("Reverse Order" + reversearray);

        LinkedList<Integer> list=new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(21);
        list.add(43);

        LinkedList<Integer> reverselist=reverselist(list);
        System.out.println("Reversed Order"+reverselist);

    }
}
