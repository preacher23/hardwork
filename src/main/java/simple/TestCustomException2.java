package simple;


    class MyCustomException extends Exception
    {
            public MyCustomException(String s){
                super(s);
            }
    }

    // class that uses custom exception MyCustomException
    public class TestCustomException2
    {
        // main method
        public static void main(String args[])
        {
            try
            {
                // throw an object of user defined exception
                throw new MyCustomException("hi");

            }
            catch (MyCustomException ex)
            {
                System.out.println("Caught the exception");
                System.out.println(ex.getMessage());
            }

            System.out.println("rest of the code...");
        }
    }

