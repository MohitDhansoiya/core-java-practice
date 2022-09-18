package employee;

import java.util.Scanner;

public class Employee15 {
    private int id;
    private String name;
    private String company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
class TestEmployee15{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Details");
        System.out.println("Employee Id:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Employee name:");
        String name = scan.nextLine();
        System.out.println("Employee Company:");
        String company = scan.nextLine();
        Employee15 emp = new Employee15();
        emp.setId(id);
        emp.setName(name);
        emp.setCompany(company);
        System.out.println(emp.getId()+" "+ emp.getName()+ " " + emp.getCompany());
    }
}
