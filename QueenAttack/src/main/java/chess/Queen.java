package chess;

import java.util.Objects;

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

    boolean canAttackDiagonally(Queen queen) {
        for (int index = 0; index < MAX_POINT; index++) {
            if (canAttackFirstDiagonal(queen, index) ||
                canAttackSecondDiagonal(queen, index) ||
                canAttackThirdDiagonal(queen, index) ||
                canAttackFourthDiagonal(queen, index))
                return true;
        }
        return false;
    }

    private boolean canAttackFirstDiagonal(Queen queen, int index) {
        return queen.x == x - index && queen.y == y + index;
    }

    private boolean canAttackSecondDiagonal(Queen queen, int index) {
        return queen.x == x + index && queen.y == y - index;
    }

    private boolean canAttackThirdDiagonal(Queen queen, int index) {
        return queen.x == x - index && queen.y == y - index;
    }

    private boolean canAttackFourthDiagonal(Queen queen, int index) {
        return queen.x == x + index && queen.y == y + index;
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
