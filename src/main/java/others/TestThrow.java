package others;

public class TestThrow {
        static void validate(int age){
            if(age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("Welcome to vote");
        }
        public static void main(String[]args){
            validate(13);
            System.out.println("Rest of code");


    }
}
