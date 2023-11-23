package refernce;

import java.util.ArrayList;
import java.util.Comparator;

public class Arraylist {
    public static void main(String[] args) {
        Arraylist arraylist=new Arraylist();
        ArrayList<Integer>arrayList1=new ArrayList<>(20);
        arrayList1.add(20);
        arrayList1.add(30);
        System.out.println(arrayList1);
        ArrayList<Integer>arrayList2=new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        arrayList1.add(1,10);
        System.out.println(arrayList1);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.removeIf(i->i==20);
        System.out.println(arrayList1);
        System.out.println( arrayList1.indexOf((Integer) 30));
        arrayList1.set(1,40);
        System.out.println(arrayList1);
        //arrayList1.sort(new myCom());
        System.out.println(arrayList1);


        class myCom implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }

    }
}
