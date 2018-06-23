package pangram;

public class PangramCheckerApp {

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();

        System.out.println(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(pangramChecker.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(pangramChecker.isPangram("abcdde"));
        System.out.println(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
        System.out.println(pangramChecker.isPangram(""));
        System.out.println(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }
}
