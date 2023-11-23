package exceptionhandling;

public class Throwkeyword {
    public static void main(String[] args) {
        try{
            throw new Exception("yes");
        } catch (Exception e) {
            System.out.println("no");
        }
    }
}
