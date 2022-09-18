package student;

public class Student{
    int id ;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void insert(){
        System.out.println(id +"  "+ name);
    }
}


