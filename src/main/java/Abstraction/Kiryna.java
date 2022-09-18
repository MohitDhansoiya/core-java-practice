package Abstraction;

public abstract class Kiryna {
    abstract void store();
}
class Pulse extends Kiryna{

    @Override
    void store() {
        System.out.println("All Items are avilable here");
    }

    public static void main(String[] args) {
        Kiryna ob = new Pulse();
        ob.store();
    }
}
