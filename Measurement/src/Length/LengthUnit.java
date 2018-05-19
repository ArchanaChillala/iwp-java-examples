package Length;


import Unit;

abstract public class LengthUnit extends Unit {
    protected double value;

    public LengthUnit(double value) {
        this.value = value;
    }

    public abstract double convertToInch();

    @Override
    public int compareTo(Object other) {
        if(!(other instanceof LengthUnit))
            return 0;
        LengthUnit that = (LengthUnit) other;
        return this.convertToInch() == that.convertToInch() ? 1 : 0;
    }
}
