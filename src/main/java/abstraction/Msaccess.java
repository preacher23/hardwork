package abstraction;

public class Msaccess implements Dbconnection{
    @Override
    public void connect() {
        System.out.println("ms accsess");
    }
}
