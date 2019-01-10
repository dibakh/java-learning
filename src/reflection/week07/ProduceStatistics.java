package reflection.week07;

import java.util.*;

public class ProduceStatistics {
    public Integer calculateTotalPayment(List<Employee> employees) {

        Integer total = 0;
        for (Employee employee : employees) {
            Integer salary = employee.getSalary();
            total += salary;
        }

        return total;
    }


    public String calculateHighestSalaryDepartment(List<Employee> employees) {
        Map<String, Integer> departmentPayments = new HashMap<>();

        for (Employee employee : employees) {
            if (!departmentPayments.containsKey(employee)) {
                departmentPayments.put(employee.getDepartment(), new Integer(0));
            }
            Integer payment = employee.getSalary();
            departmentPayments.put(employee.getDepartment(), payment);
        }

        Set<Map.Entry<String, Integer>> entries = departmentPayments.entrySet();
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(entries);
        Collections.sort(sorted, Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(sorted);
        Map.Entry<String, Integer> department = sorted.get(0);
        String departmentName = department.getKey();

        return departmentName;
    }


    public void findHighestSalary(List<Employee> employees) {

        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        Employee employee = employees.get(0);

        System.out.println("Highest salary employee: " + employee.getName() + "from " + employee.getDepartment() + " with " + employee.getSalary() + "€.");


    }
}

