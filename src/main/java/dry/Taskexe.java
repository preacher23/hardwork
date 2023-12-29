package dry;

//class Taskscheduling{
//    public String compute(){
//        return "compute";
//    }
//    public String sendNotification(){
//        return "send notification";
//    }
//    public String save(){
//        return "save object";
//    }
//}
class Schedulingapplication{
   // Taskscheduling taskscheduling;
    compute compute;
    Save save;
    Sendnotification sendnotification;
    Schedulingapplication schedulingapplication;
    public Schedulingapplication(compute compute,Save save,Sendnotification sendnotification){
       this.compute=compute;
       this.save=save;
       this.sendnotification=sendnotification;
    }
    public void Schedule(){
        System.out.println(compute.compute());
        System.out.println(save.save());
        System.out.println(sendnotification.sendNotification());
    }
}
public class Taskexe {
    public static void main(String[] args) {
   Schedulingapplication schedulingapplication=new Schedulingapplication(new compute(),new Save(),new Sendnotification());
      schedulingapplication.Schedule();
    }
}

class compute{
    public String compute(){
        return "compute";
    }
}

class Save{
    public String save(){
        return "save object";
    }
}
class Sendnotification{
    public String sendNotification(){
        return "send notification";
    }
}