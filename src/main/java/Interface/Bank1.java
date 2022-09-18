package Interface;

public interface Bank1{
    float rateofinterst();
}
class SBI1 implements Bank1{

    @Override
    public float rateofinterst() {
        return 9.5f;
    }
}
class PNB1 implements Bank1{

    @Override
    public float rateofinterst(){
        return 9.7f;
    }
}
class TestBank1{
    public static void main(String[] args) {
        Bank1 obj = new SBI1();
        obj.rateofinterst();
    }
}
