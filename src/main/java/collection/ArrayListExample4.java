package collection;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println(al);
        //accessing the element
        System.out.println("Returning element: " + al.get(1));
        System.out.println(al.get(3));//it will return the 2nd element, because index starts from 0
        //changing the element
        //al.set(1, "Dates");
      //  al.set(3,"gokul");
        System.out.println(al.remove("grapes"));
        al.remove(3);
        //Traversing list
        for (String fruit : al)
            System.out.println(fruit);

    }
}
