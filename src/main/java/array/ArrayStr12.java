package array;

public class ArrayStr12 {
    public static void main(String[] args) {
        int array [] = { 1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;  i<= array.length-1 ; i++) {
            if (array[i]%2 == 0)
            System.out.println("No is Even :"+array[i]);
        }
    }
}
