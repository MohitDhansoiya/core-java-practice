package rectangle;

import java.util.Scanner;

public class Rectangle7 {
    int length ;
    int width;
    void updateValue(int l,int w){
        length = l;
        width = w;
    }
    void areaOfRectsngle(){
        System.out.println(length * width);
    }
}
class TestRectangle7{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Area Of rectangle.Rectangle");
        System.out.println("length of Recatngle");
        int lenght = scan.nextInt();
        scan.nextLine();
        System.out.println("width of rectangle.Rectangle");
        int width = scan.nextInt();
        Rectangle7 rt = new Rectangle7();
        rt.updateValue(lenght ,width );
        rt.areaOfRectsngle();
    }
}
