package iwp;

import static iwp.Classification.ABUNDANT;
import static iwp.Classification.DEFICIENT;
import static iwp.Classification.PERFECT;

class NaturalNumber {
    private int number;

    NaturalNumber(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    Classification getClassification() {
        int sum = sumOfFactors();
        if (sum == number)
            return PERFECT;
        else if (sum > number)
            return ABUNDANT;
        else
            return DEFICIENT;
    }

    private int sumOfFactors() {
        int sum = 0;
        for (int index = 1; index < number; index++) {
            if (number % index == 0)
                sum += index;
        }
        return sum;
    }
}
