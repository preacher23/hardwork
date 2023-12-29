package dry;

class Logger{
    public void logInformation(String logInfo){
        System.out.println(logInfo);
    }
}
class Loggingtofile{
    private Logger logger;
    public Loggingtofile(Logger l){
        this.logger=l;
    }
    public void logging(){
        logger.logInformation("yess");
    }
}
public class Dip {
    public static void main(String[] args) {
     Loggingtofile loggingtofile=new Loggingtofile(new Logger());
     loggingtofile.logging();
    }
}
