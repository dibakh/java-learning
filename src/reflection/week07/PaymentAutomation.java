package reflection.week07;

import java.util.List;

public class PaymentAutomation {
    private DataGatherer dataGatherer = new DataGatherer();


    public void produceStatistic() {
        List<Employee> employees = dataGatherer.asList();

        showTransfers(employees);


        ProduceStatistics statistics = new ProduceStatistics();
        Integer totalPeyment = statistics.calculateTotalPayment(employees);
        System.out.println("Total amount paid: " + totalPeyment+"€");

        String highestSalaryDepartment = statistics.calculateHighestSalaryDepartment(employees);
        System.out.println("Most paying department: " + highestSalaryDepartment);

         statistics.findHighestSalary(employees);



    }


    private void showTransfers(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Transfer successful: " + employee.getSalary() + "euro to account " + employee.getAccount());
        }
    }
}
