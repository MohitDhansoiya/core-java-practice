package array;

import java.util.Scanner;

public class ArrayStr36 {
    public static int getThirdLargest(int [] arrNum, int whichlargest){
        int temp ;
        for(int i = 0; i < arrNum.length; i++ ){
            for(int j = i + 1; j < arrNum.length; j++){
                if(arrNum[i] > arrNum[j]){
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
        }
        return arrNum[arrNum.length - whichlargest];
    }

    /***
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of Array:");
        int length = scan.nextInt();
         int [] arrNum = new int [length];
        System.out.println("Enter Array"+ length +" numbers");
        for(int i = 0 ; i <= arrNum.length - 1; i++){
            arrNum[i] = scan.nextInt();
        }
        System.out.println("Second :"+ getThirdLargest(arrNum,2));
    }
}
