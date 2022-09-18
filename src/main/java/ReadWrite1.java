import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadWrite1 {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("");
    }
}
class TestReadWrite{
    public static void main(String[] args) {
        ReadWrite1 rw = new ReadWrite1();
        try{
            rw.readFile();
        }catch(FileNotFoundException e){
            System.out.println("hello");
        }
    }
}
