import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("abc.txt");
            System.out.println(fileReader);
        }
        catch (FileNotFoundException e) {
            System.out.println("Subclass of IOException - The exact class that handles our exception");
        }
        catch (IOException e) {
            System.out.println(e);
            System.out.println("This is a checked exception - IOExceptions. " +
                    "java compiler enforces to handle these exceptions");
        }
        finally {
            System.out.println("One finally per try-catch block. This will always be executed");
        }

        try {
            int a = 5, b = 0, x;
            x = a / b;
            System.out.println(x);
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        catch(RuntimeException e) {
            System.out.println("Super class of all unchecked exceptions "  +
                    "A generic runtime exception. Gets executed if no other unchecked sub-class is handling it");
        }
        catch(Exception e) {
            System.out.println("This is a super class of all exceptions. Checked or unchecked. \n" +
                    "This will get executed only if no other sub-class handles it");
        }
        finally {
            System.out.println("This block will always get executed");
        }
    }
}