package array;

public class Student26 {
    Student26(){
        this(5);
        System.out.println("Student deatils");
    }
    Student26(int x){
        System.out.println(x);
    }
}
class TestStudent26{
    public static void main(String[] args) {
        Student26 ob = new Student26();
    }
}
