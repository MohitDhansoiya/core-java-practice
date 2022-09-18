package LastParactice;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.Map;

public class ScanArray {
    public static void main(String[] args) {
//        String string = "Big black bug bit a big black dog on his big black nose";
//        int count;
//        string = string.toLowerCase();
//        String words[] = string.split(" ");
//        System.out.println("Duplicate words in a given string : ");
//        for (int i = 0; i < words.length; i++) {
//            count = 1;
//            for (int j = i + 1; j < words.length; j++) {
//                if (words[i].equals(words[j])) {
//                    count++;
//                    words[j] = "0";
//                }
//            }
//            if (count > 1 && words[i] != "0")
//                System.out.println(words[i]);
//        }
        String s = "abchekfhgdksfnefjfsbjhfhf";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Map<Character, Integer> map = new HashMap<>();
            if (map.containsKey(ch)) {
                int value = map.get(ch);
                value = value + 1;
            } else {
                map.put(ch, 1);
            }
        }
    }
}
