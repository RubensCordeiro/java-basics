package abstracts;

public class AbstractMain {
    public static void main(String[] args) {
        Ceo ceo = new Ceo(5000, Seniority.SENIOR, 5);
        System.out.println(ceo.yearlyBonus());
    }
}
