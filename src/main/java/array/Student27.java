package array;

public class Student27 {
    Student27(){
        System.out.println("Student Details");
    }
    Student27(int x){
        this();
        System.out.println(x);
    }
}
class TestStudent27{
    public static void main(String[] args) {
        Student27 ob = new Student27(10);
    }
}
