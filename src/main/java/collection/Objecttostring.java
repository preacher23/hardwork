package collection;

public class Objecttostring {
    public static void main(String[] args) {
        long l=100;
        Long l1=Long.valueOf(l);//primitive to wrapper
        System.out.println(l1);
        String s=l1.toString();//wrapper to string
        System.out.println(s);
        Long l2=Long.valueOf(s);//string to wrapper
        System.out.println(l2);
    }
}
