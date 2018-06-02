import java.util.HashMap;
import java.util.Map;

class RaindropConverter {
    private Map<Integer, String> raindropMap = new HashMap<Integer, String>() {{
        put(3, "Pling");
        put(5, "Plang");
        put(7, "Plong");
    }};


    String convert(int number) {
        StringBuilder sound = new StringBuilder();
        for (int factor : raindropMap.keySet()) {
            if (number % factor == 0) {
                sound.append(raindropMap.get(factor));
            }
        }
        String raindropSound = sound.toString();
        return raindropSound.isEmpty() ? Integer.toString(number) : raindropSound;
    }
}
