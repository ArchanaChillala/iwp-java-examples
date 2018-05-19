package Mass;

import Unit;

public abstract class MassUnit extends Unit {
    protected double value;

    public MassUnit(double value) {
        this.value = value;
    }

    public abstract double convertToGrams();

    @Override
    public int compareTo(Object other) {
        if(!(other instanceof MassUnit))
            return 0;
        MassUnit that = (MassUnit) other;
        return that.convertToGrams() == this.convertToGrams() ? 1 : 0;
    }
}
