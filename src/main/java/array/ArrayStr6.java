package array;

import java.util.Scanner;

public class ArrayStr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value :");
        int weather = scan.nextInt();
        switch (weather){
            case 1:
                System.out.println("It is sunny today:");
                break;
            case 2:
                System.out.println("It is rainny today:");
                break;
            case 3:
                System.out.println("It is cloudy today:");
            break;
            default:
                System.out.println("");
        }
    }
}
