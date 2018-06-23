package pangram;

import java.util.*;

class PangramChecker {
    private static final int TOTAL_ALPHABET = 26;
    private static final int ASCII_FOR_A = 97;
    private static final int ASCII_FOR_Z = 122;

    private static List<Character> getLowerCaseList() {
        List<Character> lowerCaseList = new ArrayList<>();
        for (int key = ASCII_FOR_A; key <= ASCII_FOR_Z; key++)
            lowerCaseList.add((char) key);
        return lowerCaseList;
    }

    boolean isPangram(String sentence) {
        String lowerCaseSentence = sentence.toLowerCase();
        int count = 0;
        for (Character character : getLowerCaseList()) {
            if (lowerCaseSentence.contains(character.toString())) {
                count++;
            }
        }
        return count == TOTAL_ALPHABET;
    }
}
