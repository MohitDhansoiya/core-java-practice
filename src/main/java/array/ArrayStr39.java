package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStr39 {
    public static void main(String[] args) {
        String words = "brag";
        String mean = "grab";
        words = words.toLowerCase();
        mean = mean.toLowerCase();
        if(words.length() != mean.length()){
            System.out.println("Both String are not anagram:");
        }else{
            char[] String1 = words.toCharArray();
            char [] String2 = mean.toCharArray();
            Arrays.sort(String1);
            Arrays.sort(String2);
            if(Arrays.equals(String1,String2) == true){
                System.out.println("Both string are anagram");
            }else{
                System.out.println("Both String are not anagram");
            }
        }
    }
}
