package Abstraction;
interface car1{
    void indianOil();
    void hpOil();
    void essar();
    void relaince();
}
public abstract class Petrol implements car1 {
    public void essar(){
        System.out.println("Essar Petrol price 60");
    }
}
class Truck extends Petrol{

    @Override
    public void indianOil() {
        System.out.println("Indian Oil price 70");
    }

    @Override
    public void hpOil() {
        System.out.println("hp Oil price 71");
    }

    @Override
    public void relaince() {
        System.out.println("Realiance oil price 72");
    }
}
class TestPetrol{
    public static void main(String[] args) {
        Petrol pt = new Truck();
        pt.essar();
        pt.hpOil();
        pt.indianOil();
        pt.relaince();
    }
}
