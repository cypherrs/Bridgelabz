import java.util.ArrayList;
import java.util.List;
class BubleSort{
    private List<Integer> data;

    public BubleSort(List<Integer>data){
        this.data = new ArrayList<>(data);
    }

    public void sort(){
        int n = data.size();
        for(int i = 0; i <n ; i++){
            for(int j = 0; j< n-i-1 ;j++){
                if(data.get(j)> data.get(j +1)){

                    int temp = data.get(j);
                    data.set(j,data.get(j+1));
                    data.set(j+1,temp);
                }
            }
        }
    }

    public List<Integer> getData(){
        return data;
    }
}

public class Main {
    public static void main(String[] args) {


 }
}