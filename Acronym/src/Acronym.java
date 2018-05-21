public class Acronym {
    private String phrase;

    private static final int SPACE = 32;
    private static final int HYPHEN = 45;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        StringBuilder acronym = new StringBuilder();
        acronym.append(phrase.charAt(0));
        for(int index = 1; index < phrase.length(); index++) {
            if(phrase.charAt(index) == SPACE || phrase.charAt(index) == HYPHEN) {
                acronym.append(phrase.charAt(++index));
            }
        }
        return acronym.toString().toUpperCase();
    }
}
