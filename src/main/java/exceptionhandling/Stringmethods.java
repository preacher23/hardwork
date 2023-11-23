package exceptionhandling;

public class Stringmethods {
    public static void main(String[] args) {
        String s="gokul nath";
        int l=s.length();
        System.out.println(l);
        int i=s.indexOf('o');
        System.out.println(i);
        char ch=s.charAt(2);
        System.out.println(ch);
        System.out.println("substring"+ s.substring(2));
        System.out.println("substring"+s.substring(0,4));
        System.out.println("replace"+ s.replace("u","z"));
        System.out.println("uppercase"+ s.toUpperCase());
    }
}
