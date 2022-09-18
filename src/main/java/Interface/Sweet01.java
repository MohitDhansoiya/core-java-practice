package Interface;

public interface Sweet01 {
    void draw();

    default void msg() {
        System.out.println("Burffi is also avilable");
    }
}

class Rasgula implements Sweet01 {

    @Override
    public void draw() {
        System.out.println("All sweets are avilable");
    }
}
class TestSatish{
    public static void main(String[] args) {
        Sweet01 ob = new Rasgula() ;
           ob.draw();
           ob.msg();
    }
}
