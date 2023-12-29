package dry;

public interface Travelbooking {
    public void bookTicket();
}
class Travelbookingagent implements Travelbooking{
    private Travelbooking travelbooking;
    Travelbookingagent(Travelbooking travelbooking){
        this.travelbooking=travelbooking;
    }
    @Override
    public void bookTicket() {
      travelbooking.bookTicket();
    }
}
class Trainticket implements Travelbooking{

    @Override
    public void bookTicket() {
        System.out.println("train ticket booked");
    }
}
class Flightticket implements Travelbooking{

    @Override
    public void bookTicket() {
        System.out.println("flight ticket booked");
    }
}
class DelegationDemonstraytion{
    public static void main(String[] args) {
        Travelbookingagent travelbookingagent=new Travelbookingagent(new Flightticket());
        travelbookingagent.bookTicket();

    }
}