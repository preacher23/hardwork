package inheritance;

public class Superclass {
    int x;
    public Superclass(){
        System.out.println("no arg superclass constructor");
    }
    public Superclass(int x){
        this();
        this.x=x;
        System.out.println("arg class constructor");
    }
}
