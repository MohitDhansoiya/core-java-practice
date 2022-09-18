package Abstraction;
interface Shampoo{
    void dabur();
    void hallo();
    void clinic();
    void head();
    void patanjli();
}
public abstract class Product1 implements  Shampoo{
    public void clinic(){
        System.out.println("Clinic plus Shampoo");
    }
}
class Company extends Product1{
  public void dabur(){
      System.out.println("Best brand in india");
    }
    public void hallo(){
        System.out.println("Hallo Shampoo price :");
    }

    @Override
    public void head() {
        System.out.println("best in market");
    }

    @Override
    public void patanjli() {
        System.out.println("Ayurvedic product");
    }

}
class TestProduct1{
    public static void main(String[] args) {
        Product1 ob = new Company();
        ob.clinic();
        ob.dabur();
        ob.head();
    }
}

