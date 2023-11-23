package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checkedexception {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("");
        }catch (FileNotFoundException e) {
            System.out.println("yes");
        }
    }
}
