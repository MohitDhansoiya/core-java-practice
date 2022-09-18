package rectangle;

import java.util.Scanner;

public class RectangleCaller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Length of rectangle.Rectangle as Integer");
        int length = scan.nextInt();
        System.out.println("Plesae Enter Width of rectangle.Rectangle as Integer");
        int width = scan.nextInt();

        Rectangle5 rt = new Rectangle5(length,width);
        rt.areaOfRectangle();
    }
}
