package employee;

public class Employee5 {
    int id;
    String name;
    String company;
    Employee5(int i ,String n,String c){
        id = i;
        name = n;
        company = c;
    }
    void display(){
        System.out.println(id+ "  " + name +"   "+company);
    }
}
class TestEmployee5{
    public static void main(String[]args){
        Employee5 ep = new Employee5(45,"Mohit","Rpiit");
        Employee5 ep1 = new Employee5(56,"Anu","PIET");
        ep.display();
        ep1.display();

    }
}
