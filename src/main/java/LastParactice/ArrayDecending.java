package LastParactice;

public class ArrayDecending {
    public static void main(String[] args) {
        int arr [] = new int [] {78,5,4,23,65,45,89};
        int temp = 0;
        System.out.println("Orignal Elements:");
        for(int i = 0;i < arr.length ;i++){
            System.out.println(arr[i]);
        }
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Decending Order");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
