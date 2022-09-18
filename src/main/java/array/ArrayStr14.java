package array;

public class ArrayStr14 {
    public static void main(String[] args) {
        int array [] = {1,-2 ,3 ,-4,5 ,-6,7,-8,-9,10};
        for(int i = 0; i <= array.length - 1; i++){
            if (array[i] > 0){
                System.out.println("No Is Postive:"+array[i]);
            }else if (array[i] < 0){
                System.out.println("NO Is Negtive:"+array[i]);
            }else{
                System.out.println("zero");
            }
        }
        }
    }

