package Abstraction;
interface Drawable{

    void draw();
    default void msg(){
        System.out.println("Default method");
    }
}
public class Rectangle12 implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class TestInterface{
    public static void main(String[] args) {
        Drawable d = new Rectangle12();
        d.draw();
        d.msg();
    }
}
