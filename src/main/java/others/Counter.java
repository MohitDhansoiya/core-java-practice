package others;

public class Counter {
    static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String[]args){
        Counter ct = new Counter();
        Counter ct1 = new Counter();
    }
}
