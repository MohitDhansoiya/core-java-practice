package employee;

import java.util.Scanner;

public class Employee9 {
    private int id;
    private String name;
    private float salary;

    public void setId(int id ){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float salary(){
        return salary();
    }
    void displayDetails(){
        System.out.println(id + " " + name + " "+ salary);
    }
}
class TestEmployee9{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Information");
        System.out.println("Enter Employee id");
        int  id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee name");
        String name = scan.nextLine();
        System.out.println("Enter Employee salary");
        String salary = scan.nextLine();

        new Employee9();
    }
}

