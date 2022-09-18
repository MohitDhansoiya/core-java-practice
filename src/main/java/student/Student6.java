package student;

public class Student6 {
    int id;
    String name;
    void insert(int i, String n){
        id = i;
        name = n;
    }
    void displayInformation(){
        System.out.println( id + " " + name);
    }
}
class TestStudent6{
    public static void main(String[]args){
        Student6 st = new Student6();
        Student6 st1 = new Student6();
        st.insert( 101, "mohit");
        st1.insert(102, "Anu");
        st.displayInformation();
        st1.displayInformation();
        }
}

