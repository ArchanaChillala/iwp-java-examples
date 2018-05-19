package Length;

public class Feet extends LengthUnit {
    private static final int CONVERSION_FACTOR = 12;

    public Feet(int value) {
        super(value);
    }

    @Override
    public double convertToInch() {
        return value * CONVERSION_FACTOR;
    }
}
