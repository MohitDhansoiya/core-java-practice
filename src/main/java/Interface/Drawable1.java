package Interface;

 interface Drawable1 {
     void draw();
     static int cube(int x){
         return x*x*x;
     }
}
class Rectangle15 implements Drawable1{
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
class TestInterface2{
    public static void main(String[] args) {
        Drawable1 d = new Rectangle15();
        d.draw();
        System.out.println(Drawable1.cube(3));
    }
}
