import java.util.*;

public class PangramChecker {
    private static List<Character> lowerCaseList = new ArrayList<>();
    private static final int TOTAL_ALPHABET = 26;
    private static final int ASCII_FOR_a = 97;
    private static final int ASCII_FOR_z = 122;

    public static void main(String[] args) {
        createAlphabetList();

        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(pangramChecker.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(pangramChecker.isPangram("abcdde"));
        System.out.println(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog"));
        System.out.println(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    private static void createAlphabetList() {
        for (int key = ASCII_FOR_a; key <= ASCII_FOR_z; key++)
            lowerCaseList.add((char) key);
    }

    public boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        int count = 0;
        for(Character character: lowerCaseList) {
            if(lowerCaseSentence.contains(character.toString())) {
                count++;
            }
        }
        return count == TOTAL_ALPHABET;
    }
}
