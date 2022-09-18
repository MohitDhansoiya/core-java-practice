package others;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[]args){
        String name;
        int id;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Enter id");
        id = sc.nextInt();
        System.out.println("student.Student id:"+id);
        System.out.println("Percentage of student.Student");
         percentage = sc.nextFloat();
         System.out.println("student.Student percentage:"+percentage);
         sc.close();

    }
}
