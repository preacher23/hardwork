package principle;

class fanofFan{
    public boolean ison;
    public static int staticVar;
    public void get(){
        System.out.println( staticVar++);
    }
    public void turnOn(){
        ison=true;
    }
    public void turnoff(){
        ison=false;
    }
    public void fanstatus(){
        if (ison){
            System.out.println("fan is on");
        }else {
            System.out.println("fan is off");
        }
    }
}
public class Fan1 {
    public static void main(String[] args) {
      fanofFan fanofFan1=new fanofFan();
      fanofFan fanofFan2=new fanofFan();
        //System.out.println(fanofFan.staticVar);
        fanofFan1.get();
        System.out.println(fanofFan2.staticVar);
    }
}
