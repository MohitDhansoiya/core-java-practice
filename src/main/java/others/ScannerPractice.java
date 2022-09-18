package others;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[]args){
       String s = "Skill Development";
       Scanner scan = new Scanner(s);
       System.out.println("boolean result:"+scan.hasNext());
       System.out.println("String:"+scan.nextLine());
        scan.close();
        System.out.println("--------Enter your Details-----");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = in.next();
            System.out.println("name:"+name);
            int i= in.nextInt();
            System.out.println( "Age:"+i);

            System.out.println("Enter your salary");
            double d = in.nextDouble();
            System.out.println("Salary:"+d);
            in.close();

    }
}
