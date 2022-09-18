package Abstraction;

public abstract class Bank01 {
    abstract int getRateOfInterest();
}
class Sbi extends Bank01{
    @Override
    int getRateOfInterest() {
        return 3;
    }
}
class Pnb extends Bank01{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}
class TestBank01{
    public static void main(String[] args) {
        Bank01 b;
        b = new Sbi();
        System.out.println(b.getRateOfInterest());
    }
}
