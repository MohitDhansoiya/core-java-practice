package LastParactice;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String s = "assdklffjdhjjddffndsksj";
        Map<Character,Integer > hm = new HashMap();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if (hm.containsKey(ch)){
                int value = hm.get(ch);
                value = value + 1;
                hm.put(ch,value);
            }else{
                hm.put(ch,1);
            }
        }
        Set<Character> keys = hm.keySet();
        for (Character ch: keys
             ) {
            System.out.print(ch + " - ");
            System.out.print(hm.get(ch));
            System.out.println();
        }
    }
}
