package student;

import java.util.Scanner;

public class Student19 {
    int id ;
    String name;
    static String clg = "RPIIT";
    static void method(){
         clg = "PIET";
    }
    Student19(int i,String n){
      id =  i;
      name = n;
    }
    void details(){
        System.out.println(id +"  "+ name + "  "+ clg);
    }
}
class Studentent19{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student Information");
        System.out.println("student.Student id :");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("student.Student name:");
        String name = scan.nextLine();
        Student19 st = new Student19(id ,name);
        st.details();
    }
}
