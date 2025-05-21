import java.util.Arrays;

public class Insertion {
    public static void insert(int[] array){
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] array={4,6,3,2,8,7};
        insert(array);
        System.out.print(Arrays.toString(array));
    }
}
