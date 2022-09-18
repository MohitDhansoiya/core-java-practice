package Abstraction;

public abstract class Employee04 {
    abstract void details();
    Employee04(){
        int id ;
        String name ;
    }
}
class Company04 extends Employee04{

    @Override
    void details() {
        System.out.println("Employee details");
    }
}
class TestEmployee04{
    public static void main(String[] args) {
        Employee04 ob = new Company04();
        ob.details();
    }
}
