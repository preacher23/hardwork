package exceptionhandling;

public class Stringdemo {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        String s3="abc";
        String s4=new String("abc");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }
}
