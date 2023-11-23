package variable;

public class Student1 {
        public static void main(String[] args) {
            String city = "gokuls";
            if(city == "Meerut") {
                System.out.println("city is meerut");
            }else if (city == "Noida") {
                System.out.println("city is noida");
            }else if(city == "Agra") {
                System.out.println("city is agra");
            } else if (city.equals("gokul")) {
                System.out.println("yess");
            } else if (city.length()==6&&city.equals("gokuls")) {
                System.out.println("yess length");

            } else {
                System.out.println(city);
            }
        }
    }

