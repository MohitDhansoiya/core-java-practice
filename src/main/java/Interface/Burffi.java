package Interface;

public interface Burffi {
    void shop();
}
 class Rasgula1 implements Burffi{

    @Override
    public void shop() {
        System.out.println("Satish Sweets");
    }
}
class GulabJamun implements Burffi{
    @Override
    public void shop() {
        System.out.println("Raju Sweets");
    }
}
class TestBurffi{
    public static void main(String[] args) {
        Burffi ob = new GulabJamun();
        ob.shop();
    }
}
