package java8;

import java.util.function.Predicate;

public class Predicateexample {
    public static void main(String[] args) {
        int salary=6000;
        //boolean result=salarycheck(salary);
        Predicate<Integer>p=i->i>=5000;
        boolean result=p.test(salary);
        System.out.println(result);
    }

//    private static boolean salarycheck(int salary) {
//        if (salary>=5000){
//            return true;
//
//        }else {
//            return false;
//        }
//    }

}
