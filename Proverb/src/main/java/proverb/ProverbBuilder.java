package proverb;

class ProverbBuilder {
    private String[] words;
    private StringBuilder proverb;

    ProverbBuilder(String[] words) {
        this.words = words;
        proverb = new StringBuilder();
    }

    String recite() {
        if (words.length == 0)
            return "";
        for (int index = 0; index < words.length; index++) {
            if ((index + 1) != words.length) {
                proverb.append(buildSentence(words[index], words[index + 1]));
            }
        }
        proverb.append("And all for the want of a ").append(words[0]).append(".");
        return proverb.toString();
    }

    private String buildSentence(String word, String nextWord) {
        StringBuilder sentence = new StringBuilder();
        sentence.append("For want of a ").append(word)
                .append(" the ").append(nextWord)
                .append(" was lost.\n");
        return sentence.toString();
    }
}
