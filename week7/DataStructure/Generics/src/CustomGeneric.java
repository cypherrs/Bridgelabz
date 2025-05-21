import java.util.Arrays;

public class CustomGeneric<T> {
    Object[] data;
    static int DEFAULT_SIZE=10;
    int size=0;

    public CustomGeneric(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public boolean isfull() {
        return size== data.length;
    }

    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
        CustomGeneric list=new CustomGeneric();
        for(int i=0;i<13;i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}