package numerals;

public class Units {
    private char first;
    private char fifth;
    private char last;

    public Units(char first, char fifth, char last) {
        this.first = first;
        this.fifth = fifth;
        this.last = last;
    }

    public char first() {
        return first;
    }

    public char fifth() {
        return fifth;
    }

    public char last() {
        return last;
    }
}
