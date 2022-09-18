package array;

import java.util.Arrays;

public class ArrayStr42 {
    public static void main(String[] args) {
        String str1 = "Grab";
        String str2 = "Barg";

        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Both String are not anagram");
        }else{
            char [] String1 = str1.toCharArray();
            char [] String2 = str2.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
            if(Arrays.equals(String1,String2)== true){
                System.out.println("Both the String are anagram");
            }else{
                System.out.println("Both String are  not Anagram");
            }
        }
    }
}
