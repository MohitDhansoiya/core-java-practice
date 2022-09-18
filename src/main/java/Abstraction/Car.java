package Abstraction;

public abstract class Car {
    Car(){
        System.out.println("luxary car");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
class Honda extends Car{
    void run(){
        System.out.println("high cost");
    }
}
class TestCar{
    public static void main(String[] args) {
        Car obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
