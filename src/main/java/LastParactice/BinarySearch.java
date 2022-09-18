package LastParactice;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2,3,5,6,7,8,9 ,12,17,18,19};
        int item = 8;
        int li = 0;
        int hi = arr.length - 1;
        int mi = li + hi / 2;

        while (li <= hi) {
            if (arr[mi] == item) {
                System.out.println("Element is at +" +  mi + "indexpostin");
            } else if (arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(li > hi){
            System.out.println("Element not found");
        }
    }
}
