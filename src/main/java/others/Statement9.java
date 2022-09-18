package others;

public class Statement9 {
    public static void main(String[]args){
        int age = 18;
        int weight = 50;
        if(age >= 18){
            if(weight >= 50){
                System.out.println("you are eligible to donate blood");
            }else {
                System.out.println("you are not eligible for doante blood");
            }
        }
        else{
            System.out.println("weight is greater than 18");
        }
    }
}
