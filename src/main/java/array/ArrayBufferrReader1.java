package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayBufferrReader1 {
    public static void main(String[] args)throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("enter Your Name");
        String name = br.readLine();
        System.out.println("Welcome:" + name);
    }
}
