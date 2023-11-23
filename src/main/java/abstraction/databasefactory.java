package abstraction;

public abstract class databasefactory {
    public abstract Dbconnection getdatabse(String type);
    public static databasefactory createdatabseFactory(String factorytype){
        System.out.println("one");
        if ("RDBMS".equalsIgnoreCase(factorytype)){
            System.out.println("one one");
            return new RDBMSDatabaseFactory();
        }else {
            return new DBMSDatabaseFactory();
        }
    }
}
