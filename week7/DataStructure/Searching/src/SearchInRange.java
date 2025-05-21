public class SearchInRange {
    public static boolean search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }

        for(int i=start;i<=end;i++){
            if(start>=0 && end<arr.length){
                if(target==arr[i]){
                    return true;
                }
            }


        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={3,6,90,78,67,56,434,32};
        int target=67;
        int start=2;
        int end=7;
        System.out.println(search(arr,target,start,end));
    }
}
