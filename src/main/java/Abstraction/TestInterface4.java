package Abstraction;

import Interface.Printable;

interface Printable5{
    void print();
}
interface Showable5 extends Printable {
    void show();
}
public class TestInterface4 implements Showable5 {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        TestInterface4 ob = new TestInterface4();
        ob.print();
        ob.show();
    }
}
