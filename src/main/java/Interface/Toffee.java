package Interface;

public interface Toffee {
    void parle();
    void coffee();
    void dil();
    void choco();
}
abstract class Pulse implements Toffee {
    public void dil() {
        System.out.println("heart toffee");
    }
}
class Mango extends Pulse{
    public void coffee(){
        System.out.println("coffee bite");
    }
    public void parle(){
        System.out.println("mango bite toffee");
    }
    public void choco(){
        System.out.println("Eclair toffee");
    }
}
class TestBrand{
    public static void main(String[] args) {
        Toffee tf = new Mango();
        tf.choco();
        tf.coffee();
    }
}
