package Interface;

public interface Bank10 {
    float rateOfInterst();
}
class SBI implements Bank10{

    @Override
    public float rateOfInterst() {
        return 9.15f;
    }
}
class PNB implements Bank10{

    @Override
    public float rateOfInterst() {
        return 9.7f;
    }
}
class TestInterface8{
    public static void main(String[] args) {
        Bank10 b = new SBI();
        System.out.println("ROI:"+b.rateOfInterst());
    }
}
