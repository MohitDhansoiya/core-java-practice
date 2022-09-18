package Abstraction;

public abstract class Cycle {
    public Cycle() {
        System.out.println("First Prize");
    }
    abstract void race();
    void withGear() {
        System.out.println("Second Prize");
    }
}
        class Avon extends Cycle {
            void race() {
                System.out.println("running ");
            }
        }
        class TestCycle {
            public static void main(String[] args) {
                Cycle obj = new Avon();
                obj.race();
                obj.withGear();
            }
        }
