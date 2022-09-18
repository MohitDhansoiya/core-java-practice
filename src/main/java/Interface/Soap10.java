package Interface;

public interface Soap10 {
    void shop();
}
interface Detergent{
    void shop();
}
class Rin implements Soap10,Detergent{

    @Override
    public void shop() {
        System.out.println("Rin soap and De....");
    }
}
class TestRin{
    public static void main(String[] args) {
        Soap10 ob = new Rin();
        ob.shop();
    }
}
