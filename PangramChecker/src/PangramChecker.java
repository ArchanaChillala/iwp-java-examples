import java.util.*;

public class PangramChecker {
    private static List<Character> lowerCaseList = new ArrayList<>();
    private static final int TOTAL_ALPHABET = 26;
    private static final int ASCII_FOR_a = 97;
    private static final int ASCII_FOR_z = 122;

    private static void createAlphabetList() {
        for (int key = ASCII_FOR_a; key <= ASCII_FOR_z; key++)
            lowerCaseList.add((char) key);
    }

    public boolean isPangram(String sentence) {
        createAlphabetList();

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
