package variable;

public class Student2 {
    public static void main(String[] args) {
        String address = "Delhi, India,gokul,Noida";

        if(address.endsWith("l")) {
            if(address.contains("India")&&address.contains("gokuls")) {
                System.out.println("Your city is Meerut");
            }else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }else {
                System.out.println(address.split(",")[0]);
            }
        }else {
            System.out.println("You are not living in India");
        }
    }
}
