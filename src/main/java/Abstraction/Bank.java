package Abstraction;

public abstract class Bank {
    abstract  int getRateOfInterst();
}
class SBI extends Bank{
    int getRateOfInterst(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterst(){
        return 8;
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate Of Interst:"+ b.getRateOfInterst()+"%");
        b = new PNB();
        System.out.println("Arte Of Interst:"+b.getRateOfInterst()+"%");
    }
}
