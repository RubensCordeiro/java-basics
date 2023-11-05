package abstracts;

public class Ceo extends Employee{
    private final int leadershipBonus;
    public Ceo(int baseSalary, Seniority seniority, int leadershipBonus) {
        super(baseSalary, seniority);
        this.leadershipBonus = leadershipBonus;
    }
    @Override
    public int yearlyBonus() {
        return this.leadershipBonus*this.baseSalary*this.seniority.getBonusMultiplier();
    }
}
