package Interface;

public interface Soap1 {
    void store();
}
class Vim implements Soap1{

    @Override
    public void store() {
        System.out.println("set of 3");
    }

    public static void main(String[] args) {
        Vim ob = new Vim();
        ob.store();
    }
}
