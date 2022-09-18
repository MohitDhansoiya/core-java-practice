package others;

import java.util.Scanner;

public class Statement20 {
    public static void main(String[]args){
        String yn;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first Number:");
            int no1 = scan.nextInt();
            System.out.println("Enter Second Number:");
            int no2 = scan.nextInt();
            scan.nextLine();
            System.out.println("Select Symbol(+,-,*,/)");
            String sym = scan.nextLine();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Add value:" + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtract Value:" + res);
                    break;
                case "*":
                    res = no1 - no2;
                    System.out.println("Multiplication value:" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Divide value :" + res);
                default:
            }
            System.out.println("if you want to continue(yes for y n for no)");
            yn =scan.nextLine();
        }while (yn.equals("y")||yn.equals("Y"));
    }
}
