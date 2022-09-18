public class Throwable {
    static void checkEligibilty(int stuage, int stuweight){
        if(stuage < 12 && stuweight < 40){
            throw new ArithmeticException("Student is not eligible for registration process");
        }else{
            System.out.println("Student entry is valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to the registration process");
        checkEligibilty(10,39);
        System.out.println("have a nice day..");
    }
}
