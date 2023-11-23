package objectoriented;

public class Fan1 {
    private boolean ison=false;
    public void turnon(){
        System.out.println("two");
         ison =false;

    }
    public void turnoff(){
        System.out.println("threee");
        ison =false;

    }
    public void checkfanstatus(){
        System.out.println("one");
        if (ison){
            System.out.println("fan is on");
        }else {
            System.out.println("fan is off");
        }
    }
    public static void main(String[] args) {
        Fan1 fan1=new Fan1();
        Fan1 fan11=new Fan1();
        fan1.turnon();
        fan1.checkfanstatus();
        fan11.turnoff();
        fan11.checkfanstatus();
    }
}
