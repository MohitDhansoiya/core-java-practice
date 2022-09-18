package employee;

public class Employee3 {
    int id ;
    String  name ;
    static String clg = "RPIIT";
    static void change(){
        String clg = "PIET";
    }
    void displayDetails(){
        System.out.println(id + " " + name + " " + clg);
    }
}
class TestEmployee3{
    public static void main(String[]args){
        Employee3 ep = new Employee3();
        Employee3 ep1 = new Employee3();
        ep.displayDetails();
    }
}
