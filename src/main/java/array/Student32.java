package array;

public class Student32 {
    int rollno;
    String name;
    static String college = "Its";
    static void change(){
        college = "BBDIT";
    }
    Student32(int r , String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno  + " " +name+ " " +college);
    }
}
 class TestStudent32{
     public static void main(String[] args) {
         Student32.change();
         Student32 ob1 = new Student32(111,"Karan");
         Student32 ob2 = new Student32(222,"aryan");
         Student32 ob3 = new Student32(333,"Sonuu");
         ob1.display();
         ob2.display();
         ob3.display();
     }
}
