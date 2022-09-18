package others;

public class NestedSwitch {
    public static void main(String[] args) {
        int age = 18;
        switch(age){
            case(16):
                System.out.println("You Are Under 18");
                break;
            case(18):
                System.out.println("You Are Adult");
                break;
            case( 65):
                System.out.println("You are Senior Citizen");
                break;
            default:
                System.out.println("Please give the valid age");
        }
    }
}
