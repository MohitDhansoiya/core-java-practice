package Interface;

public interface Cube01 {
    void draw();
    static int cube(int x){
        return x * x * x;
    }
}
class Rectangle01 implements Cube01{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
class TestRec{
    public static void main(String[] args) {
        Cube01 ob = new Rectangle01();
        ob.draw();
        System.out.println(Cube01.cube(5));
    }
}
