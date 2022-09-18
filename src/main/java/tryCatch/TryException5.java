package tryCatch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryException5 {
    public static void main(String[]args){
        PrintWriter pw;
        try{
            pw = new PrintWriter("jpt.txt");
            pw.println("Saved");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("file saved successfully");
    }
}
