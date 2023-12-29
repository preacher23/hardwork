package dry;

public interface Ilogger {
    public void logInformation(String loginfo);
}
class IloggertoDb implements Ilogger{
    private Ilogger ilogger;
    public IloggertoDb(Ilogger ilogger){
        this.ilogger=ilogger;
    }


    @Override
    public void logInformation(String loginfo) {
        System.out.println("yes");
    }
}
//class Loggerr{
//    public static void main(String[] args) {
//       Logger logger=new Logger();
//       Ilogger ilogger=new IloggertoDb(new IloggertoDb(logger));
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Create an instance of the Logger class
//        Ilogger logger = new Logger();
//
//        // Create an instance of the IloggertoDb class, wrapping the Logger instance
//        Ilogger loggerToDb = new IloggertoDb(logger);
//
//        // Log information using the loggerToDb instance
//        loggerToDb.logInformation("Some log information");
//    }
//}