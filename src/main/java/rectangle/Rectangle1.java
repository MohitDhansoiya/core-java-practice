package rectangle;

import java.util.Scanner;

public class Rectangle1 {
    int length ;
    int width ;
    void calculate(int l , int w){
        length = l;
        width = w;
    }
    void area(){
        System.out.println(length * width);
    }
}
class TestRectangle1{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Area of rectangle.Rectangle");
        int length = scan.nextInt();
        System.out.println("length of rectangle.Rectangle");
        int width = scan.nextInt();
        System.out.println("Width of rectangle.Rectangle");

        Rectangle1 rt = new Rectangle1 ();
        rt.calculate(length,width);
        rt.area();


    }
}
