package refernce;

interface add{
    public int add(int a,int b);
}
public class Addition {
    public static void main(String[] args) {
       add a1= ( a, b)->
        { return a+b;};
        System.out.println( a1.add(3,4));
    }
}
