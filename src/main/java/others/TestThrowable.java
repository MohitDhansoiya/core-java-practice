package others;

public class TestThrowable {
    void method() {
        int data = 50/0;
    }
    void met(){
        method();
    }
    void opertaion(){
        try{
            method();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        TestThrowable obj = new TestThrowable();
        obj.opertaion();
        System.out.println("Exception handled");
    }}
