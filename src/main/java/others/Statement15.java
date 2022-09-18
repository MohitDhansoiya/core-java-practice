package others;

public class Statement15 {
    public static void main(String[]args){
        int year = 4;
        char branch = 'c';
        switch(year){
            case 1:
                System.out.println("math ,eng ,hindi");
                break;
            case 2:
                switch(branch) {
                    case 'c':
                        System.out.println("operating system");
                        break;
                    case 'd':
                        System.out.println("java");
                    case 'e':
                        System.out.println("Data Stucture");
                        break;
                }
                break;
                case 3:
                        switch (branch){
                            case 'c':
                                System.out.println("phython");
                                break;
                            case 'd':
                                System.out.println("C++");
                                break;
                            case 'e':
                                System.out.println("logic unit data");
                                break;
                        }
                        break;
            case 4:
                switch (branch){
                    case 'c':
                        System.out.println("Internet Introduction");
                        break;
                    case 'd':
                        System.out.println("web technolgy");
                        break;
                    case 'e':
                        System.out.println("Principle of Software Engi");
                        break;
                }
            default:
                System.out.println("All subject");

                }
        }
    }

