package javaanother8;

import java.util.function.Predicate;

public class predicatejoin {
    public static void main(String[] args) {
        int[] x={10,20,30,340,40,60};
        Predicate<Integer>p= i->i>10;
        System.out.println("greater tahn");
        test(p,x);

    }
    static void test(Predicate<Integer> p,int[] x){
        for (int foerach:x){
            if (p.test(foerach)) {
                System.out.println(foerach);
            }
        }
    }
}
