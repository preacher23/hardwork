package refernce;

import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        Predicate<Integer>p=I->I<50;
        Predicate<String>s1=s->s.length()>4;
        System.out.println(s1.test("gokul"));
        System.out.println(p.test(30));
    }
}
