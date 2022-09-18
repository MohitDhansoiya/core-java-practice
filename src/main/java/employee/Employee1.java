package employee;

public class Employee1 {
    int id ;
    String name ;
    String company ;
    void insert(int i,String n,String c){
        id = i;
        name = n;
        company = c;
    }
    void information(){
        System.out.println(id+ " " + name +" "+ company);
    }
}
class TestEmp{
    public static void main(String[]args){
        Employee1  ep = new Employee1();
        Employee1 ep1 = new Employee1();
        ep.insert(101,"anu","Atlas");
        ep1.insert(102,"Sonu","Bata");
        ep.information();
        ep1.information();
    }
}
