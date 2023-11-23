package javaanother8;

public class Function {
    public static void main(String[] args) {
       // Function<String,Integer> f= s->s.length();
        java.util.function.Function<String,Integer>f=s -> s.length();
        System.out.println(f.apply("gokul"));
    }

}
