package abstracts;

public abstract class Employee {
    protected int baseSalary;
    protected Seniority seniority;

    public Employee(int baseSalary, Seniority seniority) {
        this.baseSalary = baseSalary;
        this.seniority = seniority;
    }

    public abstract int yearlyBonus();
}
