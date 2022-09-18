package Interface;

public interface Soap02 {
    void print();
    int price = 10;
    String bath = "Himalya";
}
interface Detergent1 extends Soap02{
    void show();
    int price = 120;
    String washable = "Sardar ji";
}
class TestSoap implements Detergent1{

    @Override
    public void print() {
        System.out.println("Soap is hard");
    }

    @Override
    public void show() {
        System.out.println("Detergent is pwoder");
    }

    public static void main(String[] args) {
        TestSoap ob = new TestSoap();
        ob.print();
        ob.show();
    }
}
