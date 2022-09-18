import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryCatch1 {
    void readWrite() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("c:/abc.txt");

    }
    void saveFile()throws FileNotFoundException{
        String text = "";
        FileOutputStream fos = new FileOutputStream("c:/abc.txt");
    }
}
class Test {
    public static void main(String[] args) {
        TryCatch1 tc = new TryCatch1();
        try {
            tc.readWrite();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
