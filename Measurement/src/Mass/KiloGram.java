package Mass;

public class KiloGram extends MassUnit {
    private static final double CONVERSION_FACTOR = 1000;

    public KiloGram(double value) {
        super(value);
    }

    @Override
    public double convertToGrams() {
        return value * CONVERSION_FACTOR;
    }
}
