package array;

public class StudentCounter {
    int count = 0;

    StudentCounter() {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
     StudentCounter ob1 = new StudentCounter();
     StudentCounter ob2 = new StudentCounter();
     StudentCounter ob3 = new StudentCounter();
    }
}
