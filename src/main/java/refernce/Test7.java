package refernce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(Arrays.asList(10,20,30));
//        Stream sa =arrayList.stream();
//        System.out.println(sa);
//
//        List<Integer> collect = arrayList.stream().map(i -> i * 5).collect(Collectors.toList());
////        System.out.println(collect);
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
//        Object[] array = integerStream.toArray();
//        for (Object i:array)
//              {
//                  System.out.println(i);
//
//        }

//        Stream<Integer> integerStream = Stream.of(2, 4, 6, 8);//foreach
//        integerStream.forEach(i-> System.out.println(i));

//        Stream<Integer> integerStream = Stream.of(2, 3, 4, 6, 7, 1);//min
//        Optional<Integer> min = integerStream.min((g1, g2) -> g1.compareTo(g2));
//        System.out.println(min.get());

        List<Integer> list = Arrays.asList(12, 32, 46, 78);
        boolean b = list.stream().anyMatch(i -> i == 12);
        System.out.println(b);

    }
}
