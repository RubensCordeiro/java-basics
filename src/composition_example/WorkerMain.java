package composition_example;

import java.time.LocalDate;

public class WorkerMain {

    public static void main(String[] args) {
//        Junior example
        WorkerLevel juniorLevel = WorkerLevel.JUNIOR;
        HourContract contractOne = new HourContract(
                LocalDate.of(2023, 1, 1),
                10,
                10);
        HourContract contractTwo = new HourContract(
                LocalDate.of(2022, 1, 1),
                10,
                10
        );

        Worker juniorWorker = new Worker(
                "Rubens",
                juniorLevel,
                100.,
                "IT"
        );

        juniorWorker.addContract(contractOne);
        juniorWorker.addContract(contractTwo);
        System.out.println(juniorWorker);
        System.out.println(juniorWorker.income(2023, 1));
        System.out.println(juniorWorker.income(2022, 1));
        juniorWorker.setLevel(WorkerLevel.MID);
        System.out.println(juniorWorker.income(2023, 1));
        System.out.println(juniorWorker.income(2022, 1));
        System.out.println(juniorWorker.getContracts().size());
        juniorWorker.removeContract(contractOne.getContractId());
        System.out.println(juniorWorker.income(2023, 1));
        System.out.println(juniorWorker.getContracts().size());
    }
}
