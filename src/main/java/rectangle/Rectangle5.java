package rectangle;

public class Rectangle5 {
    int leng;
    int width;

    public Rectangle5(int leng, int width) {
        this.leng = leng;
        this.width = width;
    }

    public void areaOfRectangle() {
        int result = leng * width;
        System.out.println("Area of rectangle.Rectangle:"+result);
    }
}
