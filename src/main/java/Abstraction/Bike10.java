package Abstraction;

public  abstract class Bike10 {
    abstract void race();
    int speed ;
    String name ;
}
class Honda01 extends Bike10{

    @Override
    void race() {
        System.out.println(speed + "" + name);
    }

    public static void main(String[] args) {
        Bike10 ob = new Honda01();
        ob.race();
    }
}
