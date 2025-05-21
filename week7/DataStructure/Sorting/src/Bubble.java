import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public static void bubble(int[] array){
        boolean swap;
        for(int i=0;i< array.length;i++){
            swap=false;
            for(int j=1;j< array.length-1;j++){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array={4,2,6,3,1,5};
        bubble(array);
        System.out.print(Arrays.toString(array));
    }

}
