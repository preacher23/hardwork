package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortlistwithoutlambdaandwithlambda {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(32);
        arrayList.add(9);
        System.out.println(arrayList);
        Collections.sort(arrayList,(o1,o2)->{
            if (o1>o2){
                return -1;
            }else if(o2>o1){
                return 1;
            }else {
                return 0;
            }
        });
        System.out.println(arrayList);
    }

}
//class myclass implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1>o2){
//            return -1;
//        }else if(o2>o1){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//}