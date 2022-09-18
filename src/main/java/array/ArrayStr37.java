package array;

import java.util.Scanner;
public class ArrayStr37 {
    public static void main(String[] args) {
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int length = scan.nextInt();
        scan.nextLine();
        String [] words = new String [length];
        for (int i = 0; i <= words.length - 1; i++){
            words[i] = scan.nextLine();
        }
        for(int i = 0; i < words.length ; i++){
            for(int j = i + 1; j <= words.length - 1; j++){
                if(words[i].compareTo(words[j])>0){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
             }
        }
        for(int i = 0; i < words.length ; i++){
            System.out.println(words[i]+"");
        }
    }
}
