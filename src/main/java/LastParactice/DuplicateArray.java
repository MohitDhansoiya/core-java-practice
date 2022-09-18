package LastParactice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5, 7, 6, 4, 3, 2, 4};
        Map<Integer, Integer> hm = new HashMap();
        for (int no : arr) {
            Integer count = hm.get(no);
            if (count == null) {
                hm.put(no, 1);
            } else {
                count = count + 1;
                hm.put(no, count);
            }
        }
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer,Integer>me:es){
            if(me.getValue()> 1){
                System.out.println(me.getKey()+" ");
            }
        }
    }
}

