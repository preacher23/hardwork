package collection;

public class Primitivestoobject {
    public static void main(String[] args) {
        int x=97;
        Integer i=Integer.valueOf(x);
        System.out.println(i);
        int z=i.intValue();
        System.out.println(z);
    }
}
