package enums;

public enum RandomConstant {
    FIRST("FIRST", 0), SECOND("SECOND", 1), THIRD("THIRD", 2);

    private final String name;
    private final int value;

    RandomConstant(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}
