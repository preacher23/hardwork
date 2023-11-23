package objectoriented;

class fan{
    private boolean ison=false;
    public void turnon(){
        ison =false;
        System.out.println("fan on");
    }
    public void turnoff(){
        ison =false;
        System.out.println("fan off");
    }
}
//class Demo11{
//    public void display(String info){
//
//    }
//    public String display(String info){
//        return info;
//    }
//
//}
public class Demo {
    public static void main(String[] args) {
       fan fan1=new fan();
       fan1.turnon();
       fan1.turnoff();
    }
}
