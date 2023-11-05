package composition_example;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private String department;
    private final ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, String department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(int contractId) {
        contracts.removeIf(contract -> contract.getContractId() == contractId);
    }

    public double income(int year, int month) {

        return contracts
                .stream()
                .filter(contract -> contract.getYear() == year && contract.getMonth() == month)
                .mapToDouble(HourContract::totalValue)
                .sum()
                * this.level.getHourlyRate();
    }

    ;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department='" + department + '\'' +
                ", contracts=" + contracts.size() +
                '}';
    }
}
