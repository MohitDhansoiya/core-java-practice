public class InvalidAge extends Exception {
    InvalidAge(String s){
        super(s);
    }
}
class TestInvalidAge{
    static void validate(int age) throws InvalidAge{
        if(age < 18)
            throw new InvalidAge("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }catch(Exception e){
            System.out.println("Exception occured:"+e);
        }
        System.out.println("rest of the code..");
    }
}
