package composition_example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;

public class HourContract {
    private int contractId;
    private LocalDate date;
    private double valuePerHour;
    private int hours;

    Random rd = new Random();

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.contractId = rd.nextInt(999);
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public int getContractId() {
        return this.contractId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return this.hours*this.valuePerHour;
    }

    public int getYear() {
        return this.date.getYear();
    }

    public int getMonth() {
        return this.date.getMonthValue();
    }
}
