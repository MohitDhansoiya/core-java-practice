package Abstraction;

interface JeevanDass {
    void pin1();

    void playWood();

    void hammer();

    void board();

    void machine();
}

 abstract class Carpainter implements JeevanDass {
   public void pin1() {
        System.out.println("mahinder carpainter");
    }
}

class Shop3 extends Carpainter {
    @Override
    public void playWood() {
        System.out.println("Jony Carpainter");
    }

    @Override
    public void hammer() {
        System.out.println("Sombeer Carpainter");
    }

    @Override
    public void board() {
        System.out.println("Rajesh Carpainter");
    }

    @Override
    public void machine() {
        System.out.println("Sonu Carpainter");
    }
}

class TestCarpainter {
    public static void main(String[] args) {
        JeevanDass ob = new Shop3();
        ob.board();
        ob.hammer();
        ob.pin1();
        ob.machine();
    }
}
