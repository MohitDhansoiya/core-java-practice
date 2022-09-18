package Interface;

public interface Student01 {
    int id = 0;
    String name = null;

    void details();

    default void display() {
        System.out.println(id + " " + name);
    }
}
class TestStud implements Student01{
    @Override
    public void details() {
        System.out.println("Student study in Shiv Shakti");
    }
}
class TestStudent01{
    public static void main(String[] args) {
        Student01 ob = new TestStud();
        ob.details();
        ob.display();
    }
}

