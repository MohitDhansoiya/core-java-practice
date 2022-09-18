package others;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String yn;
        do {
            System.out.println("Enter first no:");
            int no1 = scan.nextInt();
            System.out.println("Enter Second no:");
            int no2 = scan.nextInt();
            scan.nextLine();
            System.out.println("Select symbol(+,-,*,/)");
            String sym = scan.nextLine();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is:"+res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtract is:"+res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiple is:"+res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Divide is:" + res);
                default:
            }
            System.out.println("Do you want to continue(y for yes n for no) ");
            yn=scan.nextLine();
        }while(yn.equals("y")||yn.equals("Y"));
    }
}
