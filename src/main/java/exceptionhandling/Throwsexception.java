package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwsexception {
    void readfile() throws FileNotFoundException {
        FileInputStream fileInputStream= new FileInputStream("");
    }

    public static void main(String[] args) {
        Throwsexception throwsexception = new Throwsexception();
        try {
            throwsexception.readfile();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
