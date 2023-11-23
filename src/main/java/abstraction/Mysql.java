package abstraction;

public class Mysql implements Dbconnection{
    @Override
    public void connect() {
        System.out.println("my sql connection");
    }
}
