import Length.Feet;
import Length.Inch;
import Length.LengthUnit;
import Length.Yard;
import Mass.Gram;
import Mass.KiloGram;
import Mass.MassUnit;
import Mass.Pound;

public class MathStudent {
    public static void main(String[] args) {
        MathStudent student = new MathStudent();

        LengthUnit oneYard = new Yard(1);
        LengthUnit threeFeet = new Feet(3);
        System.out.println("areLengthsSame ? " + student.compare(oneYard, threeFeet));

        MassUnit halfKg = new KiloGram(0.5);
        MassUnit FiveHundredGrams = new Gram(500);
        System.out.println("areMassesSame ? " + student.compare(halfKg, FiveHundredGrams));

        MassUnit onePound = new Pound(1);
        MassUnit poundInGrams = new Gram(453.6);
        System.out.println("areMassesSame ? " + student.compare(onePound, poundInGrams));

        LengthUnit twentyFourInches = new Inch(24);
        LengthUnit twoFeet = new Feet(2);
        System.out.println("areLengthsSame ? " + student.compare(twentyFourInches, twoFeet));

        System.out.println("areUnitsSame ? " + student.compare(threeFeet, halfKg));
        System.out.println("areUnitsSame ? " + student.compare(onePound, oneYard));
    }

    private boolean compare(Unit unit1, Unit unit2) {
        return unit1.compareTo(unit2) == 1;
    }
}
