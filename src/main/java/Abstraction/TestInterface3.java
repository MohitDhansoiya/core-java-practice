package Abstraction;

import javax.imageio.stream.ImageInputStream;

interface Printable3{
    void print();
}
interface Showable3{
    void print();
}
public class TestInterface3 implements Printable3,Showable3{
    public void print() {
        System.out.println("Hello");
    }
        public static void main(String[]args){
            TestInterface3 ob = new TestInterface3();
            ob.print();
        }
    }

