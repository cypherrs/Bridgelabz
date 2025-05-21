import java.util.Arrays;

class CustomArray {

    int[] data;
    static int DEFAULT_SIZE=10;
    int size=0;
    
    public CustomArray(){
        this.data=new int[DEFAULT_SIZE];
    }
    
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public boolean isfull() {
        return size== data.length;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
        CustomArray list=new CustomArray();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);


        System.out.println(list);


    }
}
