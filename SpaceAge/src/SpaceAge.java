class SpaceAge {
    private long ageInSeconds;
    private static final long EARTH_YEAR_IN_SECONDS = 31557600;

    SpaceAge(long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    double onEarth() {
        return calculateAge(1);
    }

    double onMercury() {
        return calculateAge(0.2408467);
    }

    double onVenus() {
        return calculateAge(0.61519726);
    }

    double onMars() {
        return calculateAge(1.8808158);
    }

    double onJupiter() {
        return calculateAge(11.862615);
    }

    double onSaturn() {
        return calculateAge(29.447498);
    }

    double onUranus() {
        return calculateAge(84.016846);
    }

    double onNeptune() {
        return calculateAge(164.79132);
    }

    private double calculateAge(double periodInEarthYears) {
        return ageInSeconds / (EARTH_YEAR_IN_SECONDS * periodInEarthYears);
    }
}
