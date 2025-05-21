import java.util.*;
public class BinaryConvertion {
    public static List<String> getbinary(int n){
        List<String> result=new ArrayList<>();
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        for(int i=0;i<n;i++){
            String current=queue.remove();
            result.add(current);
            queue.add(current+"0");
            queue.add(current+"1");
        }
        return result;
    }
    public static void main(String[] args){
        int n=6;
        List<String> binary=getbinary(n);
        System.out.println("Binary Number: "+binary);
    }
}