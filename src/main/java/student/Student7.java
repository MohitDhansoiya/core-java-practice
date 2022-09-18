package student;

public class Student7 {
    int id ;
    String name;
    String college;
    void insert(int i, String n,String c){
        id = i;
        name = n;
        college = c;
    }
    void information(){
        System.out.println(id + " " + name + " "+ college);
    }
}
class TestStudent7{
    public static void main(String[]args){
        Student7 st = new Student7();
        Student7 st1 = new Student7();
        st.insert( 101,"mohit", "Iitm");
        st1.insert(102,"Anu","Dav");
        st.information();
        st1.information();
    }
}
