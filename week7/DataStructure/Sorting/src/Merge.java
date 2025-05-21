import java.util.Arrays;

public class Merge {
    static int[] merge(int[] array){
        if(array.length==1){
            return array;
        }
        int mid= array.length/2;
        int[] left=merge(Arrays.copyOfRange(array,0,mid));
        int[] right=merge(Arrays.copyOfRange(array,mid,array.length));

        return merge(left,right);

    }
    public static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<first.length && j<second.length){
            if(first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    public  static  void main(String[] args){
        int[] array={4,2,90,56,3,12,45};
        array=merge(array);
        System.out.print(Arrays.toString(array));
    }


}
