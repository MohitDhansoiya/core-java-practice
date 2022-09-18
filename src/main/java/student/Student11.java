package student;

public class Student11 {
    int id ;
    String name ;
   static String school = "Shiv";
    Student11( int i, String n){
        id = i;
        name = n;
    }
    void displayDetails(){
        System.out.println(id + " " + name +" " +school);
    }
}
class TestStudent11{
    public static void main(String[]args){
        Student11 st = new Student11(455,"name");
        Student11 st1 = new Student11(145 ,"name");
        st.displayDetails();
        st1.displayDetails();
    }
}
