package objectoriented;
class bankAccount{
    private double balance=1000;
    private String username="gokulnath";
    private String password="password";
    public double getWalletBalance(String username,String password){
        if (this.username.equals(username)&& this.password.equals(password)){
            return balance;
        }else {
            return 0.0;
        }
    }
}
public class Accessaccount {
    public static void main(String[] args) {
    bankAccount bankAccount1=new bankAccount();
        System.out.println(bankAccount1.getWalletBalance("yes","yyyeeeess"));
    }
}
