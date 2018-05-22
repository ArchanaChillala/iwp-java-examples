import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    private Map<String, Integer> transformedMap;

    public Etl() {
        transformedMap = new HashMap<>();
    }

    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        for (Integer score : old.keySet()) {
            for (String letter : old.get(score))
                transformedMap.put(letter.toLowerCase(), score);
        }
        return transformedMap;
    }
}
