package Interface;

public interface Shape1 {
    int length = 10;
    int width = 20;
    void mul();
}
class Rectangle implements Shape1{
    @Override
    public void mul() {
        int result = length * width;
        System.out.println(result);
    }
}
class Circle implements Shape1{
    int radius = 25;
    float pi = 3.14f;
    double areaOfCircle = 2* pi * radius;
    public void mul() {
        System.out.println(areaOfCircle);
    }
}
class TestInterface03{
    public static void main(String[] args) {
        Shape1 ob = new Circle();
        ob.mul();
    }
}
