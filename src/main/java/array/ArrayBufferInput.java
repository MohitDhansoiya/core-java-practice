package array;

import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.*;

public class ArrayBufferInput {
    public static void main(String[] args)throws Exception {

        FileWriter writer = new FileWriter("C:\\Users\\Thic PC\\IdeaProjects\\java-practice\\src\\main\\java\\array\\weekDays.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("once upon a time in mumbai");
        buffer.close();
        System.out.println("success");
    }
}
