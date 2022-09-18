package array;

public class Array23 {
    public static void main(String[] args) {
        int array [] =new int [] {23,43,54,75,92};
        int max = array[0];
        for(int i = 0 ; i <= array.length; i++){
            if(array[i] > max ) {
                max = array[i];
            }
            System.out.println("largest Element present in array:"+max);
        }
    }
}
