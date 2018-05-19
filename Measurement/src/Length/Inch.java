package Length;

public class Inch extends LengthUnit {

    public Inch(int value) {
        super(value);
    }

    @Override
    public double convertToInch() {
        return value;
    }
}
