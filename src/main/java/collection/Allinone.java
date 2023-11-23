package collection;

public class Allinone {

    public static void main(String[] args) {
        int x=100;
        String s= Integer.toString(x);//primitive to string
        Integer i= new Integer(s);//overloaded string type
        int z=i.intValue();//warpper to int
        Integer c= new Integer(z);//overloaded int type
        String d=c.toString();//warpper to string
        int e= Integer.parseInt(d);//string to primitive type
    }
}
