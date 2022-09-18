package LastParactice;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first No");
            int no1 = scan.nextInt();
            System.out.println("Enter second no");
            int no2 = scan.nextInt();
            scan.nextLine();

            System.out.println("Select Symbol(+,-,*,/) ");
            String sym = scan.nextLine();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition Number:" + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtract number:" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiple number:" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Divide number:" + res);
                default:
                    System.out.println("Invalid symbol");
            }
            System.out.println("Do you want to continue(press y for yes n for no)");
            yn = scan.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }

}
