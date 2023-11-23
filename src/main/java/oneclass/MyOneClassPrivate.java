package oneclass;

public class MyOneClassPrivate {
    public String frenchMethod() {
        return germanMethod();
    }

    private String germanMethod() {
        return "This is a german only method.";
    }
}


//public
//private
//static
