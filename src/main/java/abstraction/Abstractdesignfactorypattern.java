package abstraction;

public class Abstractdesignfactorypattern {
    public static void main(String[] args) {
        databasefactory db=null;
        Dbconnection dc=null;
        db=databasefactory.createdatabseFactory("RDBMS");
        System.out.println("four");
        dc=db.getdatabse("Mysql");
        System.out.println("five");
        dc.connect();
    }
}
