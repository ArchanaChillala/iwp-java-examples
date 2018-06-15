public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        if(allSidesAreZero(side1, side2, side3)) {
            throw new TriangleException();
        }
        if(triangleEqualityNotSatisfied(side1, side2, side3)) {
            throw new TriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean allSidesAreZero(double side1, double side2, double side3) {
        return side1 == 0 || side2 == 0 || side3 == 0;
    }

    private boolean triangleEqualityNotSatisfied(double side1, double side2, double side3) {
        return side1 + side2 < side3 || side2 + side3 < side1;
    }


    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }
}
