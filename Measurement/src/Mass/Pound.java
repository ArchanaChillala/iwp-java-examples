package Mass;

public class Pound extends MassUnit {
    private static final double CONVERSION_FACTOR = 453.6;

    public Pound(double value) {
        super(value);
    }

    @Override
    public double convertToGrams() {
        return value * CONVERSION_FACTOR;
    }
}
