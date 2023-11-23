package simple;

public class TestCustomException1 {
    // method to check the age
    static void validate (int age) throws InvalidMyAgeException {
        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidMyAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main(String args[])
    {
        try
        {
            // calling the method
            validate(2);
        }
        catch (InvalidMyAgeException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
