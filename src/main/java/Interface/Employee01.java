package Interface;

public interface Employee01 {
    int id = 102;
    String name = "Anu";
     void employee01();
}
interface Company {
//    int id = 101;
//    String name = "Sonu";
    void employee01();
}
class TestCompany implements Company, Employee01{
    @Override
    public void employee01() {
        System.out.println(id+ " " + name);
    }

    public static void main(String[] args) {
    TestCompany ob = new TestCompany();
    ob.employee01();

    }
}
