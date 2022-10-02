package array;

public class PrimeNoCheck {
    public static void checkPrimeNo(int no) {
        boolean flag = false;
        for (int i = 2; i < no / 2 + 1; i++) {
            if (no % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("No is prime: " + no);
        } else {
//            System.out.println("no is not a prime: " + no);
        }
    }

    public static void aramStrong(int no) {
        int no1 = no;
        int re, sum = 0;
        while (no > 0) {
            re = no % 10;
            sum = sum + (re * re * re);
            no = no / 10;
        }
        if(sum == no1){
            System.out.println("No is ArmaStrong:" + no) ;
        }else{
            System.out.println("No is not aramStrong:" +no);
        }
    }

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {

//            checkPrimeNo(i);
            aramStrong(153);
        }
    }




