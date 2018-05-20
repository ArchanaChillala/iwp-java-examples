public class Hamming {

    private String strand1;
    private String strand2;

    public Hamming(String strand1, String strand2) {
        if(strand1.length() != strand2.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        else {
            this.strand1 = strand1;
            this.strand2 = strand2;
        }
    }

    public int getHammingDistance() {
        int hammingDistance = 0;
        for(int index = 0; index < strand1.length(); index++) {
            if(strand1.charAt(index) != strand2.charAt(index))
                hammingDistance++;
        }
        return hammingDistance;
    }
}
