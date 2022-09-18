package Abstraction;

public abstract class Tailor {
    abstract void master();
}
class Radhe extends Tailor{

    @Override
    void master() {
        System.out.println("Radhe Sham Tailor master");
    }
}
class Mukesh extends Tailor{

    @Override
    void master() {
        System.out.println("Mukesh Tailor master");
    }
}
class TestTailor{
    public static void main(String[] args) {
        Tailor ob = new Mukesh();
        ob.master();
    }
}
