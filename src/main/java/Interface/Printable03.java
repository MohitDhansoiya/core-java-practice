package Interface;

public interface Printable03 {
    void print();
}
interface Showable03 extends Printable03{
    void show();
}
class TestInterface4 implements Showable03{

    @Override
    public void print() {
        System.out.println("hello");
    }

    @Override
    public void show() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        TestInterface4 ob = new TestInterface4();
        ob.print();
        ob.show();
    }
}
