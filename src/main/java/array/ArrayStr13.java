package array;

public class ArrayStr13 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.println("No is even:" + array[i]);
            }else{
                System.out.println("no is odd:"+array[i]);
            }
        }
    }
}


