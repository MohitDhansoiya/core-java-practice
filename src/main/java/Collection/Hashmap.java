package Collection;

import javafx.beans.property.SetProperty;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
//        HashMap<String, String> hashmap = new HashMap<String, String>();
//        hashmap.put("Key1", "Value1");
//        hashmap.put("Key2", "Value2");
//        System.out.println("Iterating or looping map using keySet Iterator");
//         Iterating or looping using keySet() method
//        Set<String> keySet = hashmap.keySet();
//        Iterator<String> keySetIterator = keySet.iterator();
//        while (keySetIterator.hasNext()) {
//            String key = keySetIterator.next();
//            System.out.println("key: " + key + " value: " + hashmap.get(key));
            HashMap< String ,String > hashmap = new HashMap<String ,String>();
          hashmap.put("key1" ,"value1");
          hashmap.put("key2" , "value");
        System.out.println("Iterating or looping map using");
        Set<String> keySet = hashmap.keySet();
        Iterator<String> keySetIterartor = keySet.iterator();
        while (keySetIterartor.hasNext()){
            String key = keySetIterartor.next();
            System.out.println("Key:"+ key + "Value Is:"+ hashmap.get(key));
        }
        }
    }
