package rectangle;

import java.util.Scanner;

public class Rectangle2 {
    int lenght;
    int width ;
    void  upadte(int l,int w){
        lenght = l;
        width = w;
    }
    void area(){
        System.out.println(lenght*width);
    }
}
class TestRectangle{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Area Of rectangle.Rectangle");
        System.out.println("Lenght Of rectangle.Rectangle:");
        int length = scan.nextInt();
        System.out.println("Width Of rectangle.Rectangle:");
        int width = scan.nextInt();
        System.out.println("Enter the Se");
        Rectangle2 rt = new Rectangle2();
        rt.area();
    }
}
