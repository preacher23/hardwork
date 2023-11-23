package example;

public class GreetFrench {
    private String frenchGreet(String name){
        if (name=="bon"|| name=="jou"||name=="r"){
            return name;
        }
        return "not french";
    }
}
