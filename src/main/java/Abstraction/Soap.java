package Abstraction;
interface Company1{
    void dabur();
    void patanjli();
    void ayurvedic();
}
public abstract class Soap implements Company1{
    @Override
    public void dabur() {
        System.out.println("neem soap");
    }
}
class Vim extends Soap{
    public void patanjli(){
        System.out.println("ayurvedic soap");
    }
    public void ayurvedic(){
        System.out.println("face wash");
    }
}
class TestCompany{
    public static void main(String[] args) {
        Company1 ob = new Vim();
        ob.patanjli();
        ob.ayurvedic();
        ob.dabur();
    }
}
