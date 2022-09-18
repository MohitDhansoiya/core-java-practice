package student;

public class Student8 {
    int height ;
    int weight ;
    void insert(int h,int w){
        height = h;
        weight = w;
    }
    void display(){
        System.out.println(height + " " + weight);
    }
}
class TestStudent8{
    public static void main(String[]args){
        Student8 st = new Student8();
        Student8 st2 = new Student8();
        st.insert(5,45);
        st2.insert(6,56);
        st.display();
        st2.display();
    }
}
