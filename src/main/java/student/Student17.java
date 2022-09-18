package student;

import java.util.Scanner;

public class Student17 {
    int id ;
    String name;
    void insertRecord(int i ,String n){
        id = i;
        name = n;
    }
    void displayDetails(){
        System.out.println(id + "   " + name);
    }
}
class TestStudent17{
    public static void main(String[]args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("student.Student Information");
        System.out.println(" Id Of student.Student");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Name Of student.Student");
        String name = scan.nextLine();
        Student17 st =new Student17();
        st.insertRecord(id, name);
        st.displayDetails();
    }
}
