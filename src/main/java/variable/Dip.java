package variable;

interface iLogger{
    public void logInformation(String logInfo);
}
class Logger implements iLogger{
    public void logInformation(String logInfo){
        System.out.println("one");
        System.out.println(logInfo);
    }
}
class LoggingToFile{
   // private Logger logger;
    private iLogger iLogger;
//    public LoggingToFile(Logger logger){
//        System.out.println("two");
//        this.logger=logger;
//    }
    public LoggingToFile(iLogger iLogger){
        this.iLogger=iLogger;
    }
//    public void logging(){
//        System.out.println("two two");
//        logger.logInformation("printing logs");
//    }
}
public class Dip {
    public static void main(String[] args) {
//   LoggingToFile logging=new LoggingToFile(new Logger());
//   logging.logging();
        //LoggingToFile logging=new LoggingToFile(new Logger() );
        LoggingToFile logging = new LoggingToFile(new Logger());


    }
}
