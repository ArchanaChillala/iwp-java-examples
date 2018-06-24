package cipher;

class RotationalCipher {
    private static final int TOTAL_ALPHABET = 26;
    private static final int ASCII_FOR_A = 65;
    private static final int ASCII_FOR_a = 97;

    private int key;

    RotationalCipher(int key) {
        this.key = key;
    }

    String rotate(String message) {
        StringBuilder cipherText = new StringBuilder();
        for (Character character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                int asciiCode = getAsciiCode(character);
                cipherText.append((char) (asciiCode));
            } else
                cipherText.append(character);
        }
        return cipherText.toString();
    }

    private int getAsciiCode(Character character) {
        if(Character.isLowerCase(character)) {
            return rotateAscii(character, ASCII_FOR_a);
        } else
            return rotateAscii(character, ASCII_FOR_A);
    }

    private int rotateAscii(int character, int asciiForA) {
        return asciiForA + ((character - asciiForA) + key) % TOTAL_ALPHABET;
    }
}
