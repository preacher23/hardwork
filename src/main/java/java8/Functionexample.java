package java8;

import java.util.function.Function;

public class Functionexample {
    public static void main(String[] args) {
        String s1="basicstrong";
//        int len=callLength(s);
        Function<String,Integer>func=s->s.length();
        int len=func.apply(s1);
        System.out.println(len);
    }

//    private static int callLength(String s) {
//        return s.length();
//    }
}
