package refernce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);
//        List<Integer>l2=new ArrayList<>();
//        for (Integer i:l1){
//            if (i%2==0){
//                l2.add(i);
//                System.out.print(l2);
//            }
//        List<Integer> collect = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//        long count = l1.stream().filter(i -> i % 2 == 0).count();
//        System.out.println(count);
        Comparator<Integer> comparator = (i1, i2) -> i2.compareTo(i1);
        l1.sort(comparator);
        System.out.println("Sorted List (Descending Order): " + l1);
    }
    }

