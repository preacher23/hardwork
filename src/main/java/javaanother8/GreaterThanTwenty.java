package javaanother8;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        Predicate<Integer>p=i->(i>20);
        Predicate<String>p1=s->(s=="gokul");
        //System.out.println(p.test(21));
        System.out.println(p1.test("gi"));
    }
}
