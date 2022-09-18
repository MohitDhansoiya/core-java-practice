package others;

import java.util.Scanner;

public class Account {
    int accNO;
    String name;
    float ammount;
    void insert(int a,String n,float amt){
        accNO = a;
        name = n;
        ammount = amt;
    }
    void deposit (float amt){
        ammount = ammount + amt;
        System.out.println(amt+"deposit");
    }
    void withdraw(float amt){
        if(ammount < amt){
            System.out.println("Insuficient Blance");
        }else{
            ammount = ammount - amt;
            System.out.println(amt+"withdraw");
        }
    }
    void checkBlance(){
        System.out.println("Blance is:"+ammount);
    }
    void  display(){
        System.out.println(accNO + "" + name+ " " +ammount);
    }
}
class TestAccount{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Account checking");
        System.out.println("Account No is:");
        int accNo = scan.nextInt();
        System.out.println("Name of Person:");
        String name = scan.nextLine();
        System.out.println("Total Ammount:");
        float ammount = scan.nextFloat();
        scan.close();
        Account ac = new Account();
        ac.insert(accNo, name,ammount);
        ac.deposit(ammount);
        ac.checkBlance();
        ac.withdraw(ammount);
        ac.display();
    }
}
