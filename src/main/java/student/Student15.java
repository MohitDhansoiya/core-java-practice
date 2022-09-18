package student;

import java.util.Scanner;

public class Student15 {
    int id ;
    String name;
    void insert(int i ,String n) {
        id = i;
        name = n;
    }
        void display(){
            System.out.println(id +" "+ name);
        }
    }
class TestStudent15{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Detils Information");
        int noOfStudnet = scan.nextInt();
        for(int no = 1;no <= noOfStudnet;no++){
            System.out.println("student.Student Id:");
            int id = scan.nextInt();
            System.out.println("student.Student name:");
            String name = scan.nextLine();
            Student15 st = new Student15();
        }
        scan.close();
    }
}
