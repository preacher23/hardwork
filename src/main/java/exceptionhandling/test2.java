package exceptionhandling;

public class test2 {
    public static void main(String[] args) {
        Passengers passengers=new Passengers();
        passengers.setFirstname("gokul");
        passengers.setLastname("nath");
        passengers.setId(1);

        Passengers passengers1=new Passengers();
        passengers1.setFirstname("gokul");
        passengers1.setLastname("nath");
        passengers1.setId(1);
        System.out.println(passengers.equals(passengers1));

    }
}
