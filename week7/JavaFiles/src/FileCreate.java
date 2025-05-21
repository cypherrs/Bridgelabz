import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String [] args) throws IOException {
        File f = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Bridgelabz\\week7\\JavaFiles\\src\\base case");
        //System.out.println(f.createNewFile());
        System.out.println(f.exists()); 
        //System.out.println(f.delete());
    }
}
