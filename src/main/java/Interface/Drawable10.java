package Interface;

public interface Drawable10 {
    void draw();
}
class Rectangle12 implements Drawable10{

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
class Circle21 implements Drawable10{

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
class TestInterface9{
    public static void main(String[] args) {
        Drawable10 ob = new Circle21();
        ob.draw();
    }
}
