package numerals;

import java.util.*;

import static java.lang.Math.pow;

public class RomanNumeral {
    private static Map<Integer, Units> placeValueSymbols = new HashMap<>();

    private int number;
    private Utils utils;

    static {
        placeValueSymbols.put(1, new Units('I', 'V', 'X'));
        placeValueSymbols.put(10, new Units('X', 'L', 'C'));
        placeValueSymbols.put(100, new Units('C', 'D', 'M'));
        placeValueSymbols.put(1000, new Units('M', 'o', 'o'));
    }

    RomanNumeral(int number) {
        if (number > 3000)
            throw new IllegalArgumentException("Roman Numerals can't be more than 3000");
        this.number = number;
        utils = new Utils();
    }

    String getRomanNumeral() {
        StringBuilder romanNumeral = new StringBuilder();
        List<Integer> placeValueList = utils.getPlaceValueList(number);
        int size = placeValueList.size();

        for (int index = 0, count = size - 1; index < size && count >= 0; index++, count--) {
            Double powerOf10 = pow(10, count);
            Units units = placeValueSymbols.get(powerOf10.intValue());
            romanNumeral.append(getRomanDigit(placeValueList.get(index), units));
        }
        return romanNumeral.toString();
    }

    private String getRomanDigit(int digit, Units units) {
        StringBuilder romanNumber = new StringBuilder();
        if (digit <= 3)
            getUpToThree(romanNumber, digit, units.first());
        else if (digit == 4)
            romanNumber.append(units.first()).append(units.fifth());
        else if (digit < 9) {
            romanNumber.append(units.fifth());
            getUpToThree(romanNumber, digit - 5, units.first());
        } else
            romanNumber.append(units.first()).append(units.last());
        return romanNumber.toString();
    }

    private void getUpToThree(StringBuilder romanNumeral, int end, char symbol) {
        for (int index = 1; index <= end; index++) {
            romanNumeral.append(symbol);
        }
    }
}


