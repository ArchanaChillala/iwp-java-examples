package Length;

public class Yard extends LengthUnit {
    private static final int CONVERSION_FACTOR = 36;

    public Yard(int value) {
        super(value);
    }

    @Override
    public double convertToInch() {
        return value * CONVERSION_FACTOR;
    }
}
