package polymorphism;

public class Overriding {
    public static void main(String[] args) {
        Parent.dosomething();
        Child.dosomething();
        Parent p= new Parent();
        System.out.println(p.s);
        Child c= new Child();
        System.out.println(c.s);
        //Child c1= new Parent();
        Parent c1= new Child();
        System.out.println(c1.s);

    }
}
