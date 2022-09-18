package array;

import java.io.FileReader;

public class ArrayFileRedaer {
    public static void main(String[] args)throws Exception {
        FileReader fr = new FileReader("weekDays.txt");
        int i;
        while((i = fr.read()) != -1)
            System.out.println((char)i);
        fr.close();
    }
}
