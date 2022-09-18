package others;

public class Account4 {
    int accoNo;
    String name;
    float ammount;
    void insert(int ac ,String n,float amt){
        accoNo = ac;
        name = n;
        ammount = amt;
    }
    void deposit(float amt ){
        ammount = ammount + amt;
        System.out.println(amt +"Deposit Ammount");
    }
    void withdraw(float amt){
        ammount = ammount - amt;
        System.out.println(amt+"withdraw ammount");
    }
    void checkBlance(){
        System.out.println("check Balnce:"+ammount);
    }
    void displayDetails(){
        System.out.println(accoNo + "  " + name + "    " + ammount );
    }
}
class TestAccount4{
    public static void main(String[]args){
        Account4 ac = new Account4();
        ac.insert( 456,"mohit",4564.f);
        ac.deposit( 45645.f);
        ac.withdraw(564.f);
        ac.checkBlance();
        ac.displayDetails();
    }
}
