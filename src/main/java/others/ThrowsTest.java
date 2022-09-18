package others;

import java.io.IOException;

public class ThrowsTest {
    void method()throws IOException {
        throw new IOException("Device Error");
    }
    void met() throws Exception{
        method();
    }
    void meth(){
        try{
            method();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        ThrowsTest obj = new ThrowsTest();
        obj.meth();
        System.out.println("Exception handled");
    }

}
