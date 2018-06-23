package chess;

import java.util.Objects;

import static java.lang.Math.abs;

public class Queen {
    private static final int MAX_POINT = 7;

    private int x;
    private int y;

    public Queen(int x, int y) {
        validateQueenPosition(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateQueenPosition(int x, int y) {
        if (x < 0)
            throw new IllegalArgumentException("Queen position must have positive row.");
        if (x > MAX_POINT)
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        if (y < 0)
            throw new IllegalArgumentException("Queen position must have positive column.");
        if (y > MAX_POINT)
            throw new IllegalArgumentException("Queen position must have column <= 7.");
    }

    boolean canAttackInStraightLine(Queen otherQueen) {
        for (int index = 0; index < MAX_POINT; index++) {
            if (x == otherQueen.x || y == otherQueen.y)
                return true;
        }
        return false;
    }

    boolean canAttackDiagonally(Queen otherQueen) {
        for (int index = 0; index < MAX_POINT; index++) {
            if (abs(x - otherQueen.x) == abs(y - otherQueen.y))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that == null || getClass() != that.getClass())
            return false;
        Queen queen = (Queen) that;
        return x == queen.x &&
                y == queen.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
