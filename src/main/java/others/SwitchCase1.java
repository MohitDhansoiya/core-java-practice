package others;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {

        float pi = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Select Area \n1 for rectangle \n2 for square \n3 for circle");
        int select = scan.nextInt();
        scan.nextLine();
        int area;
        switch (select) {
            case 1:
                System.out.println("Lenght of rectangle.Rectangle:");
                int lenght = scan.nextInt();
                System.out.println("width of rectangle.Rectangle:");
                int width = scan.nextInt();
                area = lenght * width;
                System.out.println("Area rectangle:" + area);
                break;
            case 2:
                System.out.println("Length of Side:");
                int side = scan.nextInt();
                area = side * side;
                System.out.println("Area of square:" + area);
                break;
            case 3:
                System.out.println("radius of circle:");
                int radius = scan.nextInt();
                float circleArea = pi * radius * radius;
                System.out.println("Area of circle:" + circleArea);
                break;
            default:
                System.out.println("Invalid input...");
                System.out.println("Please press \n1 for rectangle \n2 for square \n3 for circle");

        }
//        scan.nextLine();
//        scan.nextLine();
//        scan.nextLine();
    }
}
