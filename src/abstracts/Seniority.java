package abstracts;

public enum Seniority {
    JUNIOR(1), MID(2), SENIOR(3);

    private final int bonusMultiplier;

    Seniority(int bonusMultiplier) {
        this.bonusMultiplier = bonusMultiplier;
    }

    public int getBonusMultiplier() {
        return bonusMultiplier;
    }
}
