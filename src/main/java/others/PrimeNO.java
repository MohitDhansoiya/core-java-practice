package others;

import java.util.Scanner;

public class PrimeNO {
    public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        if(isPrime(n)) {
            System.out.println(n + "is a prime number");
        } else{
                System.out.println(n+"is a not prime number");
            }
        }
        public static boolean  isPrime(int n){
            if(n <=1){
                return false;
            }
            for(int i = 2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

