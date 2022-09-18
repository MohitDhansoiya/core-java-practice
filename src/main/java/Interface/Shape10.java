package Interface;

public interface Shape10 {
    void details();
    int lenght = 10;
    int width = 20;
}
interface Circle10{
    void display();
    int radius = 21;
    float pi = 3.14f;
}
class Rectangle02 implements Circle10,Shape10{
    int result = width * lenght;

    @Override
    public void display() {
        System.out.println(result);
    }

    @Override
    public void details() {
        float areaOfCircle = 2 * radius * pi ;
        System.out.println(areaOfCircle);
    }

    public static void main(String[] args) {
        Rectangle02 ob = new Rectangle02();
        ob.details();
        ob.display();
    }
}
