package mohit.cases;

public class SwitchCaseTest {
    public static void main(String[] args) {
        int month = 12;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in month:");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in month:");
            case 2:
                System.out.println("28 days in month:");


        }
    }
}
