import java.util.HashMap;

import static java.lang.String.valueOf;

public class RnaTranscription {
    private static HashMap<Character, Character> transcription = new HashMap<>();

    static {
        transcription.put('G', 'C');
        transcription.put('C', 'G');
        transcription.put('T', 'A');
        transcription.put('A', 'U');
    }

    public static void main(String[] args) {
        RnaTranscription rna = new RnaTranscription();
        System.out.println(rna.transcribe("GG"));
    }

    public String transcribe(String strand) {
        StringBuilder newString = new StringBuilder();
        for(Character character : strand.toCharArray())
            newString.append(transcription.get(character));
        return valueOf(newString);
    }
}
