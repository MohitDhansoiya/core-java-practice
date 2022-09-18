package Abstraction;

public abstract class Electricity {
    Electricity(){
        System.out.println("Fancy items are Avilable");
    }
    abstract void shop();
    void store(){
        System.out.println("Fancy fan are aslo Avilable");
    }
}
class Tube extends Electricity{

    @Override
    void shop() {
        System.out.println("Fancy Tube and Bulb");
    }
}
class Fan extends Electricity{

    @Override
    void shop() {
        System.out.println("Fancy fan Aslo avilable here");
    }
}
class TestElectricity{
    public static void main(String[] args) {
        Electricity ob = new Fan();
        ob.store();
        ob.shop();
    }
}
