package array;

public class Student30 {
    int rollno;
    String name;
    float fee;
    Student30(int r, String n, float f){
        rollno = r;
        name = n;
        fee = f;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }
}
class TestStudent30{
    public static void main(String[] args) {
        Student30 ob1 = new Student30(111,"Anu",500f);
        Student30 ob2 = new Student30(222,"Mohit",6254f);
        ob1.display();
        ob2.display();
    }
}
