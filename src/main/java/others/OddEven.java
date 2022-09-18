package others;

import java.util.Scanner;

public class OddEven {
    int no;
    OddEven(int odd){
        this.no = no;
    }
    void operation(){
        if(no % 2== 0){
            System.out.println("no is Even");
        }
        else {
            System.out.println("No is Odd");
        }
        System.out.println("Value is");
    }
}
class TestOdd{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Checked value is");
        int no = scan.nextInt();
        OddEven ob = new OddEven(no);
        ob.operation();
    }
}
