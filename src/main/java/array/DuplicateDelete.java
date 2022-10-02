package array;

public class DuplicateDelete {
    public static void main(String[] args) {
        int arr [] = { 2,5,6,3,4,2,5};
        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1; j <= arr.length - 1; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
