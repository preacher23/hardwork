package dry;

public class Slap {
    public static void main(String[] args) {
       getDetailsandMail();
    }
    public static void getDetailsandMail(){
        //code to fetch details from databse
        System.out.println("fetching details from database");
        String details ="details";
        emailTheuser(details);
    }
    public static void emailTheuser(String details){
        //code to email the user
        System.out.println("mailing the user");
    }
}
