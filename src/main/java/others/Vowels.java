package others;

import java.util.Scanner;

public class Vowels {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int no;
        System.out.println("Total Vowels");
        no = scan.nextInt();
        switch(no){
            case 1:
            System.out.println("a");
            break;
            case 2:
                System.out.println("e");
                break;
            case 3:
                System.out.println("i");
                break;
            case 4:
                System.out.println("o");
                break;
            case 5:
                System.out.println("u");
            default:
                System.out.println("There are Five vowels");
        }
    }
}
