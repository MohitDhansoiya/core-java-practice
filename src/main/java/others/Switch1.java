package others;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int no;
        System.out.println("name of maonth");
            no = scan.nextInt();
        switch(no){
            case 1:
                System.out.println("JAn");
                break;
            case 2:
                System.out.println("feb");
                break;
                case 3:
                    System.out.println("march");
                    break;
            default:
                System.out.println("In valid");



        }
    }
}
