package array;

public class StudentCounter1 {
    static int count = 0;
    StudentCounter1(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
     StudentCounter1 ob1 = new StudentCounter1();
     StudentCounter1 ob2 = new StudentCounter1();
     StudentCounter1 ob3 = new StudentCounter1();
    }
}
