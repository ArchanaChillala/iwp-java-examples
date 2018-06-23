package chess;

class QueenAttackCalculator {
    private Queen queen1;
    private Queen queen2;

    QueenAttackCalculator(Queen queen1, Queen queen2) {
        validateQueens(queen1, queen2);
        this.queen1 = queen1;
        this.queen2 = queen2;
    }

    private void validateQueens(Queen queen1, Queen queen2) {
        if (queen1 == null || queen2 == null)
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        if (queen1.equals(queen2))
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
    }

    boolean canQueensAttackOneAnother() {
        return queen1.canAttackInStraightLine(queen2) ||
                queen1.canAttackDiagonally(queen2);
    }
}
