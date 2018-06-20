package numerals;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;

public class Utils {
    private static final int BASE_10 = 10;

    public List<Integer> getPlaceValueList(int number) {
        List<Integer> placeValueList = new ArrayList<>();
        while (number != 0) {
            int digit = number % BASE_10;
            placeValueList.add(digit);
            number /= BASE_10;
        }
        reverse(placeValueList);
        return placeValueList;
    }
}
