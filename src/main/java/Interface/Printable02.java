package Interface;

public interface Printable02 {
    void print();
}
interface Showable02{
    void print();
}
class TestInterface implements Printable02,Showable02{

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface ob = new TestInterface();
        ob.print();
    }
}
