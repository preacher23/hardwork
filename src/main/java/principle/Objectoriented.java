package principle;

class fan{
    public void turnOn(){
        System.out.println("turn on");
    }
    public void turnOff(){
        System.out.println("turn off");
    }
}
public class Objectoriented {
    public static void main(String[] args) {
        fan fan1= new fan();
        fan1.turnOn();
    }
}
