package Interface;

public interface Shutdent03 {
    int rollNo = 10;
    String name = "anu";
    void details();

}
class School01 implements Shutdent03{
    public void details(){
        System.out.println(rollNo +"  "+ name);
    }

    public static void main(String[] args) {
        School01 ob = new School01();
        ob.details();
    }
}

