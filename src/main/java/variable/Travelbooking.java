package variable;

public interface Travelbooking {
    public void bookTicket();
}
class Ticketbookingbyagent implements Travelbooking{
    Travelbooking t;
    public  Ticketbookingbyagent(Travelbooking t) {
        System.out.println("two");
        this.t=t;
    }

    @Override
    public void bookTicket() {
        System.out.println("threee");
        t.bookTicket();
    }
}

class Trainticket implements Travelbooking {

    @Override
    public void bookTicket() {
        System.out.println("one");
        System.out.println("train ticket booking");
    }
}
class Flightticket implements Travelbooking{

    @Override
    public void bookTicket() {
        System.out.println("flight ticket boking");
    }
}