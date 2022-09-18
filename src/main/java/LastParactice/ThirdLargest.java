package LastParactice;

public class ThirdLargest {
    public static int print(int a[], int total) {
        int temp = 0;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
    return a[total-3];
}
    public static void main(String[] args){
    int a[] = new int [] {6,8,9,3,6,5,4};
        System.out.println("find Element:"+print(a,7));
        }
}
