package abstraction;

public class Scinece {
    Subject t=new Subject();//this is tightly coupled
    public void startReading(){
   t.read();
    }
}

class Subject{
    public void read(){
        System.out.println("reading science");
    }
}
