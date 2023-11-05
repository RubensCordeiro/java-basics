package composition_example;

public enum WorkerLevel {
    JUNIOR(1), MID(1.5), SENIOR(2.5);

    private final double hourlyRate;

    WorkerLevel(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }
}
