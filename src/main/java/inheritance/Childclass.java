package inheritance;

public class Childclass extends Superclass{
    Childclass(){
        this(10);
        System.out.println("no arg childclass constructor");
    }
    Childclass(int x){
        super(20);
        System.out.println("arg child calss constructor");
    }

    public static void main(String[] args) {
        Childclass childclass=new Childclass();
    }
}
