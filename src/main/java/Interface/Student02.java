package Interface;

public interface Student02 {
    void details();
    int rollNo = 102;
    String name = "Anu";
   default void display(){
        System.out.println(rollNo + "" + name);
    }
}
class School implements Student02{

    @Override
    public void details() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        School ob = new School();
        ob.details();
        ob.display();
    }
}
