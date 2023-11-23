package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
       list.add("gokul");
        //HashSet<String> set=new HashSet(list);
        HashSet<String>set = new HashSet<>();
        set.addAll(list);
        set.add("Gaurav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

