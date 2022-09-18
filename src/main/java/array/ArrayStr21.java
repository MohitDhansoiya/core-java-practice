package array;

import java.util.Scanner;

public class ArrayStr21 {
    //    1.enter no digit first line
//    2.enter size of array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of digit:");
        int value = scan.nextInt();
        scan.nextLine();
        int numArray[] = new int[value];
        for (int i = 0; i <= numArray.length - 1; i++) {
            numArray[i] = scan.nextInt();
        }
        for (int i = 0; i <= numArray.length - 1; i++) {
        System.out.println(numArray[i]);
        }
        for(int i = 0; i <= numArray.length -1; i++){
            if(numArray[i] > 0){
                System.out.println("Positive");
            }else{
                System.out.println("negative");
            }
        }


        }
        }



