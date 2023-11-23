package variable;

class Bird{
    //base functionality related to bird
    public void info(){
        System.out.println("im a bird");
    }
//    public void fly(){
//        System.out.println("im flying bird");
//    }
}
class Flyingbird extends Bird{
    public void fly(){
        System.out.println("im flying bird");
    }
}
class Sparrow extends Flyingbird{

}
class Ostrich extends Bird{

}
public class LSPexe {
    public static void main(String[] args) {
     Ostrich ostrich=new Ostrich();
     ostrich.info();
    }
}
