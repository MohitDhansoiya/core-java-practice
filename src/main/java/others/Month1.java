package others;

import java.util.Scanner;

public class Month1 {
    int month;
    Month1(int month){
        this.month = month;
    }
    void opreation(){
        if(month == 1){
            System.out.println("First month is January");
        }
        else if(month == 2){
            System.out.println("second month is february");
        }
        else if(month ==3){
            System.out.println("third month is March");
        }
        else if(month ==4){
            System.out.println("fourth month is april");
        }
        else if(month == 5){
            System.out.println("fiveth month is may");
        }
        else if(month == 6) {
            System.out.println("sixth monthnis june");
        }
        else if(month == 7){
            System.out.println("seventh month is july");
        }
        else if(month == 8){
            System.out.println("eight month is august");
        }
        else if(month == 9){
            System.out.println("nine month is september");
        }
        else if (month == 10){
            System.out.println("tenth month is october");
        }
        else if(month == 11){
            System.out.println("eleventh month is november");
        }
        else if(month == 12){
            System.out.println("twelveth month is december");
        }
        else {
            System.out.println("Invalid number");
        }
        System.out.println("name of month ");
    }
}
class TestMonth{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Year of the month");
        int month = scan.nextInt();

        Month1 ob = new Month1(month);
        ob.opreation();
    }
}
