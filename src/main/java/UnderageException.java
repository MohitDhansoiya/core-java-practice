public class UnderageException extends RuntimeException {
    UnderageException(){
        super("You are under age");
    }
    UnderageException(String message){
        super(message);
    }
}
class Voting1{
    public static void main(String[] args) {
        try{
            int age = 16;
            if(age < 18){
                throw new UnderageException("You are not eligble for voting");
            }else{
                System.out.println("you can vote ");
            }
        }catch(RuntimeException e) {
            e.printStackTrace();
        }
            System.out.println("Hello");

    }
}
