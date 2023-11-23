package java8;

public class Lambdaclass2 {
    public static void main(String[] args) {
     myinterface myinterface=s->s.length();
        System.out.println(myinterface.findlength("gokulnath"));
    }
}
interface myinterface{
    public int findlength(String s);

}