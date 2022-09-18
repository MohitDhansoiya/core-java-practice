package Interface;

public interface Employee02 {
    void details();
    int id = 101;
    String name = "Anu";
    default void display(){
        System.out.println(id + " " + name);
    }
}
class Company02 implements Employee02{

    @Override
    public void details() {

    }

    @Override
    public void display() {
        System.out.println(id +" " + name);
    }
}
class TestCompany02{
    public static void main(String[] args) {
        Employee02 ob = new Company02();
        ob.display();
        ob.display();
    }
}
