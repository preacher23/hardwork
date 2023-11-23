package abstraction;

public class DBMSDatabaseFactory extends databasefactory{
    @Override
    public Dbconnection getdatabse(String type) {
        Dbconnection dc=null;
        if ("Msaccess".equalsIgnoreCase(type)){
            dc=new Msaccess();
        }else if ("Mysql".equalsIgnoreCase(type)){
            dc=new Mysql();
        }
        return dc;
    }
}
