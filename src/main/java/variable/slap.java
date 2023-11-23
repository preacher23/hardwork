package variable;

public class slap {
    String month;

    public static void main(String[] args) {
   getDetailsandmail();
    }

    public static void getDetailsandmail(){
        System.out.println("fethching details from dtabase");
        String details ="details";
        emailTheUser(details);
    }

    private static void emailTheUser(String details) {
        System.out.println("mailing the user");
    }

}
