package others;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting level");
        int level;
        level = scan.nextInt();

        switch (level){
            case 1:
                System.out.println("Beginnier");
                break;
            case 2:
                System.out.println("Intermediate");
                break;
            case 3:
                System.out.println("Expert");
                break;
            default:
                System.out.println("Finally");

        }
    }
}
