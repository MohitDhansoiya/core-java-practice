package employee;

public class Employee6 {
    int id;
    String name;
    String company;
        void displayDetails(){
            System.out.println(id+ " "+ name+" "+company);
        }
        void updateValue(){
            System.out.println(id+" "+name);
            this.displayDetails();
        }
    }
class TestEmployee{
    public static void main(String[]args) {
        Employee6 ep = new Employee6();
        ep.updateValue();
    }

}
