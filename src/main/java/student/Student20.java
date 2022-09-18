package student;

public class Student20 {
    int id;
    String name,clg;
    float fee;

    Student20(int id,String name,String clg){
    this.id = id;
    this.name = name;
    this.clg = clg;
    }
    Student20(int id, String name ,String clg,float fee){
        this(id,name,clg);
        this. fee = fee;
    }
    void display(){
        System.out.println(id+ "   " + name+ "   " + clg  +"    "+ fee );
    }
}
class TestStudent20{
    public static void main(String []args){
        Student20 st = new Student20(445,"Mohit ","iitm");
        Student20 st2 = new Student20(233,"Sonu","piet",456.f);
        st.display();
        st2.display();
    }
}
