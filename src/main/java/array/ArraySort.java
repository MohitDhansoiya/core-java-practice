package array;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {3, 1, 8, 6, 2, 9, 10};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
    }
}
