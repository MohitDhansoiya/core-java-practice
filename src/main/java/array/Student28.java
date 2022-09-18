package array;

public class Student28 {
    void display(){
        System.out.println("Student of School");
    }
    void detils(){
        System.out.println("Student class");
        this.display();
    }
}
class TestStudent28{
    public static void main(String[] args) {
        Student28 ob1 = new Student28();
        ob1.detils();
    }
}