import java.util.*;

public class EmployeeDTO {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee emp1 = new Employee("Raj", 12345, "Engineering", 75000);
        Employee emp2 = new Employee("Kumar", 12346, "Engineering", 85000);
        list.add(emp1);
        list.add(emp2);
        showDetails(list);
    }

    public static void showDetails(List<Employee> list) {
        for (Employee emp : list) {
        System.out.println("Employee Name: " + emp.getEmployeeName() + ", ID: " + emp.getEmployeeID() + ", Department: " + emp.getDepartment() + ", Salary (Rs): " + emp.getSalary());
    }
}
}

class Employee {
    private String employeeName;
    private int employeeID;
    private String department;
    private int salary;

    public Employee(String employeeName, int employeeID, String department, int salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }


}

 
