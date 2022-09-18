package employee;

public class Employee8 {
    int id;
    String name,course;
    float fee;
    Employee8(int id ,String name,String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    Employee8(int id,String name,String course,float fee){
        this(id,name,course);
        this.fee = fee;
    }
    void displayDetails(){
        System.out.println(id+ " " +name+" "+ course+" "+fee);
    }
}
class TestEmployee8{
    public static void main(String[]args){
        float fee = 678f;
        Employee8 ep = new Employee8(111,"mohit","java ");
        Employee8 ep1 = new Employee8(112,"Sonu","java",fee);
        ep.displayDetails();
        ep1.displayDetails();
    }
}
