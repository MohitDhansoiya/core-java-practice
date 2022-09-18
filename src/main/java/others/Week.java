package others;

import java.util.Scanner;

public class Week {
    int day;
    Week(int day){
        this.day = day;
    }
    void operation(){
    if( day == 1){
        System.out.println("First Day is Monady");
    }
    else if(day == 2){
        System.out.println("Second Day is Tuesday");
    }
    else if(day == 3){
        System.out.println("Third Day is Wednesday");
    }
    else if(day == 4){
        System.out.println("fourth Day is thursday");
    }
    else if(day == 5){
        System.out.println("Fifth Day is friday");
    }
    else if(day == 6){
        System.out.println("Sixth Day is saturday");
    }
    else if(day == 7){
        System.out.println("Seventh Day is sunday");
    }
    else{
        System.out.println("Invalid number");
    }
        System.out.println("End of week");
    }}
    class TestWeek{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Day of the week");
        int day = scan.nextInt();

        Week ob = new Week(day);
            ob.operation();

    }
    }
