package Interface;

public interface Printable {
    void print();
}
class Copy implements Printable{

    @Override
    public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Copy ob = new Copy();
        ob.print();
    }
}
