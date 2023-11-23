package variable;

public class Delegationdesignation {
    public static void main(String[] args) {
        Ticketbookingbyagent ticketbookingbyagent=new Ticketbookingbyagent(new Trainticket());
        ticketbookingbyagent.bookTicket();

    }
}
