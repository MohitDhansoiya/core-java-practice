package LastParactice;

public class RemoveDuplicate {
    public static int removeDuplicate(int arr[], int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {56, 98, 89, 76, 67, 56, 89, 76};
        int lenght = arr.length;
        lenght = removeDuplicate(arr, lenght);
        for (int i = 0; i <= lenght; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
