public class YoungerAgeException extends  RuntimeException{
    YoungerAgeException(String message){
        super(message);
    }
}
class Voting{
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting");
            } else {
                System.out.println("Vote Success");
            }
        }catch (YoungerAgeException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
