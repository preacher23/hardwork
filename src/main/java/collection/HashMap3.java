package collection;

import java.util.HashMap;
import java.util.Map;

class HashMap3 {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "gokul");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        hm.replace(100,"Amit","gokulnath");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}