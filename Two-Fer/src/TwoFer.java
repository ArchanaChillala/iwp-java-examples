import java.util.Scanner;

public class TwoFer {
    public static void main(String[] args) {
        TwoFer twoFer = new TwoFer();

        System.out.println("Enter a name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println(twoFer.twofer(name));

    }

    public String twofer(String name) {
        if(name == null)
            name = "you";
        return "One for " + name + ", one for me.";
    }
}
