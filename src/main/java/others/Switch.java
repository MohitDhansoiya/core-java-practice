package others;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println(" Number Switch");
        number = scan.nextInt();
        switch (number){
            case 10:System.out.println("10");
            break;
            case 20:System.out.println("20");
            break;
            case 30:System.out.println("30");
            default:
                System.out.println("Not in 10,20,30");
        }
    }
}
