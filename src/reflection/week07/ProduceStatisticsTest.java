package reflection.week07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.List;


class ProduceStatisticsTest {
    DataGatherer dataGatherer = new DataGatherer();
    List<Employee> employees = dataGatherer.asList();

    ProduceStatistics produceStatistics = new ProduceStatistics();

    @Test
    void calculateTotalPayment() {
        Integer answer = produceStatistics.calculateTotalPayment(employees);
        Assertions.assertEquals(23250, answer);

    }

    @Test
    void calculateHighestSalaryDepartment() {
        String answer = produceStatistics.calculateHighestSalaryDepartment(employees);
        Assertions.assertEquals("IT", answer);
    }

    @Test
    void findHighestSalary() {
        String answer = produceStatistics.calculateHighestSalaryDepartment(employees);
        Assertions.assertEquals("Peter from Cleaning with 2600€", answer);

    }
}