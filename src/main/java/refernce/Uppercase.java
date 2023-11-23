package refernce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {
    public static void main(String[] args) {
        List<String>l1=new ArrayList<>();
        l1.add("gokul");
        l1.add("nath");
        List<String> collect = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
