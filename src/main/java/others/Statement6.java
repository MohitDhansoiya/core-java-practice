package others;

public class Statement6 {
    public static void main(String[]args){
        int marks = 50;
        if (marks >= 50 && marks < 60) {
            System.out.println("grade is d");
        }
        else if (marks >= 60 && marks <= 70){
            System.out.println("grade is c");
        }
        else if(marks >= 70 && marks <= 80 ){
            System.out.println("grade is b");
        }
        else if(marks >= 80 && marks <= 90){
            System.out.println("grade is a");
        }
        else if (marks >= 90 && marks <= 100){
            System.out.println(" Merit ");
        }
        else{
            System.out.println("First Division");
        }
        System.out.println(" Executed ");
        }
    }

