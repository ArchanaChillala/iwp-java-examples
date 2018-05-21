public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int number) {
        int sum = 0;
        for(int digit = 1; digit <= number; digit++) {
            sum += digit;
        }
        return sum * sum;
    }

    public int computeSumOfSquaresTo(int number) {
        int sum = 0;
        for(int digit = 1; digit <= number; digit++) {
            sum += digit * digit;
        }
        return sum;
    }

    public int computeDifferenceOfSquares(int number) {
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }
}
