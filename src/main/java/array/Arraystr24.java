package array;

public class Arraystr24 {
    public static void main(String[] args) {
        int array [] = new int [] {1,3,4,5,6,3,2,3,4,8,5};
        System.out.println("Duplicate Elements in given array:");
        for(int i = 0 ; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
