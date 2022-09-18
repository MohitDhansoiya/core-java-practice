package Interface;

public interface Kiryana {
    void store();
    static int cube(int x){
        return x*x*x;
    }
}
class Soap implements Kiryana{

    @Override
    public void store() {
        System.out.println("Pulse are also avilable");
    }
}
class TestKiryana{
    public static void main(String[] args) {
        Kiryana ob = new Soap();
        ob.store();
        System.out.println(Kiryana.cube(8));
    }
}
