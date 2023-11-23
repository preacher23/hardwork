package collection;

public class Primitivestostring {
    public static void main(String[] args) {
        byte b=100;
          String s=Byte.toString(b);
        System.out.println(s);
        Byte b1=Byte.parseByte(s);
        System.out.println(b1);
    }
}
