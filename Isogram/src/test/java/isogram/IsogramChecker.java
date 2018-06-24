package isogram;

import java.util.function.Supplier;
import java.util.stream.IntStream;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Supplier<IntStream> characters = () -> phrase.toLowerCase().codePoints().filter(Character::isLetter);
        long distinctLetterCount = characters.get().distinct().count();
        long totalLetters = characters.get().count();
        return distinctLetterCount == totalLetters;
    }
}
