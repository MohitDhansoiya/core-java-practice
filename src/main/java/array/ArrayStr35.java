package array;

public class ArrayStr35 {
    public static int getThirdLargest(int[] a , int total){
        int temp;
        for(int i = 0; i < total ; i++){
            for(int j = i + 1; j < total ; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 3];
    }

    public static void main(String[] args) {
        int [] a = {1,3,4,5,6,7,};
//        int [] b = {22,44,55,66,77,88};
        System.out.println("Third Largest Number:"+getThirdLargest(a,6));
//        System.out.println("Third Largest Number:"+getThirdLargest(b,77));
    }
}
