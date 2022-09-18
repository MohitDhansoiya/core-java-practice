package Abstraction;

public abstract class Sweets {
    abstract void shop();
}
class Rasgula extends Sweets{

    @Override
    void shop() {
        System.out.println("Satish Sweets");
    }

    public static void main(String[] args) {
        Sweets ob = new Rasgula();
        ob.shop();
    }
}
