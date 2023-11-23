package collection;

import access.Modifier;

public class Modifierc extends Modifier {
    public static void main(String[] args) {
        Modifier modifier=new Modifier();
        System.out.println(modifier.c);//public only access
        Modifierc modifierc=new Modifierc();
        System.out.println(modifierc.d);//protected access
    }
}
