package object;

public class Address {
    String city, state, country,plan;

    public Address(String city, String state, String country,String plan) {
        System.out.println("first");
        this.city = city;
        this.state = state;
        this.country = country;
        this.plan =plan;
        System.out.println("second");
    }
}
  
