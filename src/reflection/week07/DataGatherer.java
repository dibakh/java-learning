package reflection.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGatherer {

    private FileReader reader = new FileReader();

    public List<Employee> asList() {
        List<String> lines = getLines();
        List<Employee> employees = toEmploeesRecord(lines);
        return employees;
    }

    private List<String> getLines() {
        return reader.asLines("employees.csv");
    }

    private List<Employee> toEmploeesRecord(List<String> lines) {
        List<Employee> records = new ArrayList<>();

        for (String line : lines) {
            records.add(toEmploeesRecord(line));
        }
        return records;
    }

    private Employee toEmploeesRecord(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String name = columns.get(0);
        String department = columns.get(1);
        String salary = columns.get(2);
        String account = columns.get(3);
        return new Employee(name, department, Integer.valueOf(salary), account);
    }


}





