package refernce;

import java.util.ArrayList;

public class Arraylistdemo {
    public static void main(String[] args) {
        //Arraylist arraylist=new Arraylist(20);
        ArrayList arrayList= new ArrayList();
        arrayList.add(10);
        arrayList.add(true);
        arrayList.add(-5);
        System.out.println(arrayList);
        arrayList.remove(new Integer(10));
        System.out.println(arrayList);

    }
}
