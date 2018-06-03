import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {
    private String dnaStrand;
    private Map<Character, Integer> nucleotideCountMap = new HashMap() {{
        put('A', 0);
        put('C', 0);
        put('G', 0);
        put('T', 0);
    }};

    NucleotideCounter(String dnaStrand) {
        for (Character nucleotide : dnaStrand.toCharArray()) {
            if (!nucleotideCountMap.containsKey(nucleotide)) {
                throw new IllegalArgumentException();
            }
        }
        this.dnaStrand = dnaStrand.toUpperCase();
    }

    Map<Character, Integer> nucleotideCounts() {
        for (Character nucleotide : dnaStrand.toCharArray()) {
            if (nucleotideCountMap.containsKey(nucleotide)) {
                nucleotideCountMap.replace(nucleotide, nucleotideCountMap.get(nucleotide) + 1);
            }
        }
        return nucleotideCountMap;
    }
}
