package access;

public class Modifierb {
    public static void main(String[] args) {
        Modifier modifier=new Modifier();
        System.out.println(modifier.b);//default access
        System.out.println(modifier.c);//protected access
        System.out.println(modifier.d);//public access
    }
}
