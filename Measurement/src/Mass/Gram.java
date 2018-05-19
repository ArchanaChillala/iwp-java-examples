package Mass;

public class Gram extends MassUnit {

    public Gram(double value) {
        super(value);
    }

    @Override
    public double convertToGrams() {
        return value;
    }
}
