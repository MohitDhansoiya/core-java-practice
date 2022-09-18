package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraybufferExample {
    public static void main(String[] args) throws Exception{
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name = "";
        while(!name.equals("Stop")){
            System.out.println("Enter Data");
            name = br.readLine();
            System.out.println("Data is:"+name);
        }
        br.close();
        r.close();
    }
}
