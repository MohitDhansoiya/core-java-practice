package array;

public class FunctionStatic {
    int rollno;
    String name;
    static String college = "ITs";
    FunctionStatic(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(rollno + "" + name + ""+ college);
    }
}
 class TestStatic{
     public static void main(String[] args) {
         FunctionStatic fs1 = new FunctionStatic(111,"karan");
         FunctionStatic fs2 = new FunctionStatic(222,"aryan");
         fs1.display();
         fs2.display();
     }
}