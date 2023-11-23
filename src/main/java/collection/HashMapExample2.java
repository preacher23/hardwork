package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes");
        map.put(4,"Banana");
        map.put(null,"gokul");
        map.put(null,"g1");
        map.put(null,"g2");//trying duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map.size());
    }
}
