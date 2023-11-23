package abstraction;


import java8.A;
class Salary{
    public double getBalance1() {
        return balance1;
    }

    public void setBalance1(double balance1) {
        this.balance1 = balance1;
    }

//    @Override
//    public String toString() {
//        return "Salary{" +
//                "balance1=" + balance1 +
//                '}';
//    }

    private double balance1;
}
class Account{
    private double balance;

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

}
public class EnscapsulationDemo {
    public static void main(String[] args) {
     Account account=new Account();
     account.setBalance(77);
        System.out.println(account.getBalance());
        Salary salary=new Salary();
        salary.setBalance1(account.getBalance());
        System.out.println(salary.getBalance1());

    }
}
