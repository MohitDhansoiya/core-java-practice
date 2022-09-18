package student;

public class Student5 {
    String name;
    int id ;
}
class TestStudent{
    public static void main(String[]args){
        Student5 st = new Student5();
        Student5 st2 = new Student5();
        st.id = 102;
        st.name = "Sonu";
        st2.id = 101;
        st2.name = "Anu";
        System.out.println(st.id + " " + st.name);
        System.out.println(st2.id + " "+ st2.name);
    }

}
