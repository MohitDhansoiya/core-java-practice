package employee;

import java.util.Scanner;

public class Employee4 {
    int id;
    String name;
    static String clg = "RPIIt";
    static void updateValue(){
        String clg = "PIET";
    }
    Employee4(int i,String n){
        id = i;
        name = n;
    }
    void displayDetails(){
        System.out.println(id + " " + name + " "+ clg);
    }
}
class TestEmpLoyee4{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Details");
        System.out.println("Employee ID");
        int id = scan.nextInt();
        System.out.println("Name Of Emplyee");
        String name = scan.nextLine();
        scan.close();
        Employee4 ep = new Employee4(id,"name");
        ep.displayDetails();
    }
}
