package student;

import java.util.Scanner;

public class Student14 {
    int id ;
    String name;
}
class TestStudent14{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("student.Student Details");
        int noOfStudent = scan.nextInt();
        for(int no = 1;  no<= noOfStudent ; no++){
            System.out.println("student.Student id :");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("student.Student name:");
            String name = scan.nextLine();
            Student14 st = new Student14();
            st.id = id;
            st.name = name;
            System.out.println(id + "   "+ name);
        }
        scan.close();
    }
}
