package handshake;

import java.util.*;

import static handshake.Signal.*;
import static java.lang.Math.pow;

class HandshakeCalculator {
    private static final Map<Integer, Signal> handshakeMap = new HashMap<>();
    private static final int BASE_2 = 2;
    private static final int BASE_10 = 10;

    private List<Signal> secretMessage = new ArrayList<>();

    static {
        handshakeMap.put(1, WINK);
        handshakeMap.put(10, DOUBLE_BLINK);
        handshakeMap.put(100, CLOSE_YOUR_EYES);
        handshakeMap.put(1000, JUMP);
        handshakeMap.put(10000, REVERSE);
    }

    List<Signal> calculateHandshake(int number) {
        for (Integer element : convertToBinaryList(number)) {
            if (element.equals(0))
                continue;

            Signal message = handshakeMap.get(element);
            secretMessage.add(message);

            if (REVERSE.equals(message)) {
                Collections.reverse(secretMessage);
                secretMessage.remove(message);
            }
        }
        return secretMessage;
    }

    private List<Integer> convertToBinaryList(int integer) {
        List<Integer> handshakeList = new ArrayList<>();

        for (int index = 0; integer != 0; index++) {
            int binaryDigit = integer % BASE_2;
            Double decimalNumber = binaryDigit * pow(BASE_10, index);
            handshakeList.add(decimalNumber.intValue());
            integer /= BASE_2;
        }
        return handshakeList;
    }
}
