package array;

public class ArrayStr32 {
    public static void main(String[] args) {
        int arr [] =new int [] {5,6,8,9,2};
        int temp = 0;
        System.out.print("Element Of Orignal Array");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                   temp =  arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Element of array Sorted in Ascending order:");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
