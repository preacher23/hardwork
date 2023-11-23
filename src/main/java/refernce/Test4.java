package refernce;

import java.util.function.Predicate;

public class Test4 {


    public static void main(String[] args) {
        int[] x1={12,34,56,7,9};
        Predicate<Integer>p1=x->x%2==0;
        m2(p1,x1);
    }

    private static void m2(Predicate<Integer> p1, int[] x) {
        for (int i:x){
            if(p1.test(i)){
                System.out.println(i);
            }else {
                System.out.println("ooddd");
            }
        }
    }

}
