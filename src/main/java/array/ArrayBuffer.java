package array;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArrayBuffer {
    public static void main(String[] args)throws Exception {

        FileReader fr = new FileReader("C:\\Users\\Thic PC\\IdeaProjects\\java-practice\\src\\main\\java\\array\\weekDays.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i = br.read()) != -1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
