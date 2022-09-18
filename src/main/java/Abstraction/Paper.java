package Abstraction;
interface Printable1{
    void Print();
}
interface Showable1{
    void show();
}
public class Paper implements Printable1,Showable1 {
    @Override
    public void Print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Paper obj = new Paper();
        obj.Print();
        obj.show();
    }
}
