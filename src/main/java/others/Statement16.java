package others;

public class Statement16 {
    public static void main(String[]args){
        char Branch = 'c';
        int year = 2;
        switch (year) {
            case 1:
                System.out.println("Math ,Hindi");
                break;
            case 2:
                switch (Branch){
                    case 'c':
                        System.out.println("Java ");
                        break;
                    case 'd':
                        System.out.println("Logic Unit");
                    default:
                        System.out.println("Data Stucture");
                }
        }
    }
}
