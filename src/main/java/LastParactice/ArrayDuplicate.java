package LastParactice;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int a[] = new int[]{5, 7, 6, 2, 3, 4, 2, 4, 5, 6, 7, 8};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for(int j = i + 1; j <a.length; j++){
                if(a[i] == a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
