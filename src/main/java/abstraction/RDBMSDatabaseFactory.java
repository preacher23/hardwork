package abstraction;

public class RDBMSDatabaseFactory extends databasefactory{
    @Override
    public Dbconnection getdatabse(String type) {
        Dbconnection dc=null;
        if ("Msaccess".equalsIgnoreCase(type)){
            dc=new Msaccess();
        }else if("Mysql".equalsIgnoreCase(type)){
            System.out.println("three");
            dc=new Mysql();
        }
        return dc;
    }
}
