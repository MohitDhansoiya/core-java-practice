package LastParactice;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of given array: ");
        //Loop through the array by incrementing value of i
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("Element of reverse "+arr[i]+"");

        }
    }
}