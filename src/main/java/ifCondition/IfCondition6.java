package ifCondition;

import java.util.Scanner;

public class IfCondition6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Blood camp");
        int age, weight;
        System.out.println("Age is");
        age = scan.nextInt();
        System.out.println("Weight is ");
        weight = scan.nextInt();
        if (age > 18) {
            if (weight > 50) {

                System.out.println("You are eligilble to donate Blood");
            System.out.println("your Weight is eligible for donate Blood");
        } else {
            System.out.println("Lower age not Allowed");
        }
    } else {
            System.out.println("Lower Weight is not Allowed");
        }

    }
}

