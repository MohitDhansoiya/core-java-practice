public interface Drawable {
    void draw();
}
class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
    class Circle implements Drawable{

        @Override
        public void draw() {
            System.out.println("drawing circle");
        }
    }
class TestInterface1{
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}
